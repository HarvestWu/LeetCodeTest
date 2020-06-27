import java.util.ArrayList;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 20:35
 **/
public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int len = list.size();
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
