package net.der_floh.codewars.which_are_in;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by knogl on 24.10.2017.
 */
public class WhichAreIn {

    // Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
//    public List<String> filterAndSort(List<String> firstList, List<String> secondList) {
//
//        return firstList.stream().filter(sample -> inList(sample, secondList)).collect(Collectors.toSet()).stream().sorted().collect(Collectors.toList());
//    }

    private boolean inList(String text, List<String> list) {
//        for(String s : list) {
//            if (s.indexOf(text) >= 0) {
//                return true;
//            }
//        }
//        return false;
        return list.stream().filter(sample -> sample.indexOf(text) >= 0).count() > 0;
    }

    public String[] inArray(String[] array1, String[] array2) {
        return Arrays.asList(array1).stream().filter(sample -> (Arrays.asList(array2).stream().filter(sample2 -> sample2.indexOf(sample) >= 0).count() > 0)).collect(Collectors.toSet()).stream().sorted().toArray(String[]::new);
    }

//    public List<String> filterAndSort(List<String> firstList, List<String> secondList) {
//        return firstList.stream().filter(sample -> secondList.stream().anyMatch(sample2 -> sample2.indexOf(sample) >= -1)).collect(Collectors.toSet()).stream().sorted().collect(Collectors.toList());
//    }
}
