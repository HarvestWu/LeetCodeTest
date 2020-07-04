import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-04 21:56
 **/
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> cs = new HashSet<>();
        int result = 0, p = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            while (p < len && !cs.contains(s.charAt(p))) {
                cs.add(s.charAt(p));
                ++p;
            }
            result = Math.max(result, p - i);
            cs.remove(s.charAt(i));
        }
        return result;
    }
}
