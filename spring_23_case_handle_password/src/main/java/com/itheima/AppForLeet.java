package com.itheima;

import java.util.ArrayList;
import java.util.HashMap;

public class AppForLeet {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int lens = removeElement(nums, 2);
        for (int i = 0; i < lens; i++) {
            System.out.println(nums[i]);
        }
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        diagonalSort(mat);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(mat[i][j]);
            }
        }
        return null;
    }
}
