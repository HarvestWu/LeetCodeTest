package top601to800;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 11:52
 **/
public class Solution706 {

    @Test
    public void test706() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertEquals(1, myHashMap.get(1));
        assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2, 1);
        assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        assertEquals(-1, myHashMap.get(2));
    }

    class MyHashMap {
        List<Integer> map_key, map_value;

        public MyHashMap() {
            map_key = new ArrayList<>();
            map_value = new ArrayList<>();
        }

        public void put(int key, int value) {
            if (map_key.contains(key)) {
                map_value.set(map_key.indexOf(key), value);
            } else {
                map_key.add(key);
                map_value.add(value);
            }
        }

        public int get(int key) {
            if (map_key.contains(key)) {
                return map_value.get(map_key.indexOf(key));
            } else {
                return -1;
            }
        }

        public void remove(int key) {
            if (map_key.contains(key)) {
                map_value.remove(map_key.indexOf(key));
                map_key.remove((Integer) key);
            }
        }
    }
}
