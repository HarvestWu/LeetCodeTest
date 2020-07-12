package top1401to1600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 17:49
 **/
public class Solution1450 {

    @Test
    public void test1450() {
        int[] startTime = {1, 2, 3}, endTime = {3, 2, 7};
        int queryTime = 4;
        int result = busyStudent(startTime, endTime, queryTime);
        System.out.println(result);
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                result++;
            }
        }
        return result;
    }
}
