package top201to400;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 18:53
 **/
public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        return map(s, t) && map(t, s);
    }

    private boolean map1(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    private boolean map(String s, String t) {
        int[] maps = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (maps[s.charAt(i)] == 0) {
                maps[s.charAt(i)] = t.charAt(i);
            } else {
                if (maps[s.charAt(i)] != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
