package com.manish.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReversedLinkedList {

    public static void reverseTravasal(LinkedList<?> list1) {
        ListIterator<?> itr = list1.listIterator(list1.size());

        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }
}
