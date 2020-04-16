package com.company;

import java.util.HashSet;
import java.util.Set;

public class Gemstornes {

    static int gemstones(String[] arr) {

    Set intersection = new HashSet();

    for (int i = 0; i < arr.length; i++) {
        Set tempHashSet = new HashSet();
        for (int j = 0; j < arr[i].length(); j++) {
            tempHashSet.add(arr[i].charAt(j));
        }
        if (i == 0) {
            intersection.addAll(tempHashSet);
        } else {
            intersection.retainAll(tempHashSet);
        }
    }

    return intersection.size();
    }
}
