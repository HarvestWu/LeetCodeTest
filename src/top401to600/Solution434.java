package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-14 13:04
 **/
public class Solution434 {

    @Test
    public void test434(){
        System.out.println(countSegments("Hello, nice to meet you"));
    }

    public int countSegments(String s) {
        s = s.trim();
        if (s.length()==0){
            return 0;
        }
        return s.split("\\s+").length;
    }
}
