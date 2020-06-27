/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 19:52
 **/
public class Solution1295 {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int t : nums) {
            String str = String.valueOf(t);
            if (str.length()%2 == 0){
                result++;
            }
        }
        return result;
    }
}
