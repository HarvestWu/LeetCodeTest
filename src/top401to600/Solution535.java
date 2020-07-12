package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 17:58
 **/
public class Solution535 {

    @Test
    public void test535() {
        String str = "https://leetcode.com/problems/design-tinyurl";
        String result = decode(new Solution535().encode(str));
        System.out.println(result);
    }

    public String encode(String longUrl) {
        return longUrl;
    }

    public String decode(String shortUrl) {
        return shortUrl;
    }
}
