/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 17:49
 **/
public class Solution1450 {
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
