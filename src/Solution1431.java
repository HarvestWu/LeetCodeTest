/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 14:56
 **/

import java.util.ArrayList;
import java.util.List;

class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
