package com.manish.example;

import java.util.HashSet;

public class RetainingSets {

    public static HashSet<?> retainSet(HashSet<?> set1, HashSet<?> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
