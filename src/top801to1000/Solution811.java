package top801to1000;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 20:59
 **/
public class Solution811 {

    @Test
    public void test811() {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(cpdomains));
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            String[] t = s.split("[\\s.]");
            int count = Integer.valueOf(t[0]);
            StringBuilder tmp = new StringBuilder();
            for (int i = t.length - 1; i > 0; i--) {

                tmp.insert(0, t[i]);
                map.put(tmp.toString(), map.getOrDefault(tmp.toString(), 0) + count);
                tmp.insert(0, ".");
            }
        }
        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key) + " " + key);
        }
        return result;
    }
}
