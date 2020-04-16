package com.company;

import java.util.HashSet;
import java.util.Set;

public class Gemstornes {

    static int gemstones(String[] arr) {

        Set intersection = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            Set tempSet = new HashSet();
            for (int j = 0; j < arr[i].length(); j++) {
                tempSet.add(new Character(arr[i].charAt(j)));
            }
            if (i == 0) {
                intersection.addAll(tempSet);
            } else {
                intersection.retainAll(tempSet);
            }
        }

        return intersection.size();

    }



}
