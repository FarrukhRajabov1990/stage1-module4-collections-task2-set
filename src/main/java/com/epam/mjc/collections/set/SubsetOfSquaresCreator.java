package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        NavigableSet<Integer> squares = new TreeSet<>();
        for (Integer source : sourceList) {
            squares.add(source*source);
        }
        return squares.subSet(lowerBound, true, upperBound, true);
    }
}
