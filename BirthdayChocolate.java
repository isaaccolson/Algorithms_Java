package com.company;

import java.util.List;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {

        int setCounter = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = s.get(i);
            for (int j = i + 1; j < m + i; j++) {
                sum += s.get(j);
            }
            if (sum == d) setCounter++;
        }
        return setCounter;
    }
}
