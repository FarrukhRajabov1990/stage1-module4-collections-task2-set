package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> result = new HashSet<>();
        for (Integer source : sourceList) {
            if (source%2 == 0) {
                result.add(source);
                while (source%2 == 0){
                    source/=2;
                    result.add(source);
                }

            } else {
                result.add(source);
                result.add(source*2);
            }
        }
        return result;
    }
}
