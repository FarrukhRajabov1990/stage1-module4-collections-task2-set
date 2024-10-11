package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> firstCopy = new HashSet<>(firstSet);

        firstCopy.retainAll(secondSet);
        firstCopy.removeAll(thirdSet);
        Set<String> result = new HashSet<>(firstCopy);

        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        result.addAll(thirdSet);
        return result;
    }
}
