package top1401to1600;

import org.junit.Test;

import java.util.*;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 21:45
 **/
public class Solution1436 {

    @Test
    public void test1436() {
        List<List<String>> paths = new ArrayList<>();
        List<String> list1 = Arrays.asList("London", "New York");
        List<String> list2 = Arrays.asList("New York", "Lima");
        List<String> list3 = Arrays.asList("Lima", "Sao Paulo");
        paths.add(list1);
        paths.add(list2);
        paths.add(list3);
        String result = destCity(paths);
        System.out.println(result);
    }

    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : paths) {
            map.put(list.get(0), list.get(1));
        }
        String city = paths.get(0).get(1);
        while (map.get(city) != null) {
            city = map.get(city);
        }
        return city;
    }
}
