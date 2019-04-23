package com.example.navigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class HelloFragment extends Fragment {

    /*private String label;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments()!= null){
            this.label=getArguments().getString("label","Buuu!");
        }
    }
*/
    //private TextView helloLabel;


    //private Listener listener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hello_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //((MainActivity) getActivity()).theseAreNumbers(10,25);
                Toast.makeText(getActivity(),"Hello fragment",Toast.LENGTH_LONG).show();
            }
        });
        //((TextView) view.findViewById(R.id.hello_label)).setText(label);
        //this.helloLabel=((TextView) view.findViewById(R.id.hello_label));
    }
    /*public void setLabel(String label){
        helloLabel.setText(label);
    }*/
    /*public void setListener(Listener listener) {
        this.listener = listener;
    }*/

}
