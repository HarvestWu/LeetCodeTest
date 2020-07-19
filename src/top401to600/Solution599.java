package top401to600;

import org.junit.Test;

import java.util.*;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 15:18
 **/
public class Solution599 {

    @Test
    public void test599() {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> list = new ArrayList<>();
        int min_index = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                if (min_index > j + map.get(list2[j])) {
                    list.clear();
                    min_index = j + map.get(list2[j]);
                    list.add(list2[j]);
                } else if (min_index == j + map.get(list2[j])) {
                    list.add(list2[j]);
                }

            }
        }
        return list.toArray(new String[0]);
    }
}
