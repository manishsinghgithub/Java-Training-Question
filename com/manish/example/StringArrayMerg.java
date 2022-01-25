package com.manish.example;

import java.util.ArrayList;

public class StringArrayMerg {

    public static ArrayList<?> stringMerge(ArrayList<String> str1, ArrayList<String> str2) {
        str1.addAll(str2);
        return str1;

    }
}
