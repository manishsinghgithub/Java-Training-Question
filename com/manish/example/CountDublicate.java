package com.manish.example;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDublicate {

    public static HashMap<String, Integer> dublicateCount(ArrayList<String> str) {
        HashMap<String, Integer> ans = new HashMap<>();

        for (Object it : str) {
            if (ans.containsKey(it)) {
                int vl = ans.get(it);
                ans.put(it.toString(), vl + 1);
            } else {
                ans.put(it.toString(), 1);
            }
        }
        return ans;
    }
}
