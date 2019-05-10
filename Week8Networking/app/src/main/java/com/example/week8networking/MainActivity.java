package com.example.week8networking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "https://raw.githubusercontent.com/";
    private static Retrofit retrofit;

    private String bookbook;

    String[] arraySpinner = new String[]{
            "0","1","2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BookApi api = getRetrofit().create(BookApi.class);

        Call<List<Book>> books = api.getBooks("books");
        books.enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
                if(response.isSuccessful()){
                    Log.d("Response",response.body().toString());

                    int aux = 0;
                    for(Book book:response.body()){
                        bookbook=book.getTitle()+"\n"+book.getAuthor()+"\n"+book.getPublisher()+"\n"+book.getYear();
                        Log.d("Response",bookbook);
                        arraySpinner[aux]=bookbook;
                        aux++;
                    }
                    Spinner s = (Spinner) findViewById(R.id.spinner);

                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_spinner_item, arraySpinner);

                    s.setAdapter(adapter);
                }
                else{
                    Log.d("Response","The code is" +response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Book>> call, Throwable t) {
                Log.e("Response","Error in call",t);

            }
        });





    }
    public static Retrofit getRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
