import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 11:18
 **/
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(), pre_list;
        result.add(1);
        if (rowIndex == 0) {
            return result;
        }
        pre_list = result;
        for (int i = 1; i <= rowIndex; i++) {
            result = new ArrayList<>();
            result.add(1);
            for (int j = 0; j < pre_list.size() - 1; j++) {
                result.add(pre_list.get(j) + pre_list.get(j + 1));
            }
            result.add(1);
            pre_list = result;
        }
        return result;
    }
}
