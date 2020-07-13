package top201to400;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 18:36
 **/
public class Solution401 {

    @Test
    public void test401(){
        System.out.println(readBinaryWatch(2));
    }

    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            if (Integer.bitCount(h) > num){
                continue;
            }
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num){
                    list.add(String.format("\"%d:%02d\"",h,m));
                }
            }
        }
        return list;
    }
}
