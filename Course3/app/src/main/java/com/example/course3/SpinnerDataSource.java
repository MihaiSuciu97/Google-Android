package com.example.course3;

import java.util.ArrayList;
import java.util.List;

public class SpinnerDataSource {

    public List<String> getDataSource(){
        List<String> versions = new ArrayList<>();
        versions.add("Cupcake");
        versions.add("Pie");
        versions.add("Kitkat");
        versions.add("Lollipop");
        versions.add("Donut");

        return versions;
    }
}
