package com.itheima;

import java.util.HashMap;
import java.util.Map;

public class AppForTest {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C' && i != s.length() - 1) {
                if (s.charAt(i + 1) == 'D') {
                    res += 400;
                    i++;
                    continue;
                } else if (s.charAt(i + 1) == 'M') {
                    res += 900;
                    i++;
                    continue;
                }
            } else if (s.charAt(i) == 'X' && i != s.length() - 1) {
                if (s.charAt(i + 1) == 'L') {
                    res += 40;
                    i++;
                    continue;
                } else if (s.charAt(i + 1) == 'C') {
                    res += 90;
                    i++;
                    continue;
                }
            } else if (s.charAt(i) == 'I' && i != s.length() - 1) {
                if (s.charAt(i + 1) == 'V') {
                    res += 4;
                    i++;
                    continue;
                } else if (s.charAt(i + 1) == 'X') {
                    res += 9;
                    i++;
                    continue;
                }
            }
            res += map.get(s.charAt(i));
        }
        return res;
    }
}
