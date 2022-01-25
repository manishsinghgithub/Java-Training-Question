import com.manish.example.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // App.linkedListQuestion();
        App.countDublicate();
        // App.setQuestion();
        // App.stringArrayMerging();
    }

    public static void linkedListQuestion() {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        ReversedLinkedList.reverseTravasal(list);
    }

    public static void setQuestion() {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = (int) Math.random(); i < 10; i++) {
            set1.add(i + 1);
        }

        System.out.println(set1);

        for (int i = (int) Math.random(); i < 10; i++) {
            set2.add(i);
        }

        System.out.println(set2);

        System.out.println(RetainingSets.retainSet(set1, set2));
    }

    public static void stringArrayMerging() {
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();

        str1.add("This");
        str1.add("is");
        str1.add("day");
        str1.add("one");

        str2.add("This");
        str2.add("is");
        str1.add("day");
        str1.add("two");

        StringArrayMerg.stringMerge(str1, str2);

    }

    public static void countDublicate() {
        ArrayList<String> str = new ArrayList<>();
        str.add("super");
        str.add("man");
        str.add("is");
        str.add("bat");
        str.add("man");

        HashMap<String, Integer> ans = CountDublicate.dublicateCount(str);
        System.out.println(ans);
    }
}
