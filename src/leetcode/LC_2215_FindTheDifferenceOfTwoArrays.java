package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC_2215_FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> setNums1 = new HashSet<>();
        HashSet<Integer> setNums2 = new HashSet<>();

        for (int num: nums1) {
            setNums1.add(num);
        }

        for (int num: nums2) {
            setNums2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num: setNums1) {
            if (!setNums2.contains(num)){
                list1.add(num);
            }
        }

        for (int num: setNums2) {
            if (!setNums1.contains(num)){
                list2.add(num);
            }
        }

        return List.of(list1,list2);
    }
}
