package top200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 10:44
 **/
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list, pre_list;
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        pre_list = Collections.singletonList(1);
        result.add(pre_list);
        if (numRows == 1) {
            return result;
        }
        for (int i = 2; i <= numRows; i++) {
            list = new ArrayList<>();
            list.add(1);
            for (int j = 0; j < pre_list.size() - 1; j++) {
                list.add(pre_list.get(j) + pre_list.get(j + 1));
            }
            list.add(1);
            result.add(list);
            pre_list = list;
        }
        return result;
    }
}
