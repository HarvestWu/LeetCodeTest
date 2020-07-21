package top601to800;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 11:25
 **/
public class Solution705 {

    @Test
    public void test705() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        assertTrue(myHashSet.contains(1));
        assertFalse(myHashSet.contains(3));
        myHashSet.add(2);
        assertTrue(myHashSet.contains(2));
        myHashSet.remove(2);
        assertFalse(myHashSet.contains(2));
    }

    class MyHashSet {
        private List<List<Integer>> lists;

        public MyHashSet() {
            lists = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                List<Integer> list = new ArrayList<>();
                lists.add(list);
            }
        }

        public void add(int key) {
            int index = key % 100;
            if (!lists.get(index).contains(key)) {
                lists.get(index).add(key);
            }
        }

        public void remove(int key) {
            int index = key % 100;
            if (contains(key)){
                lists.get(index).remove((Integer) key);
            }
        }

        public boolean contains(int key) {
            int index = key % 100;
            return lists.get(index).contains(key);
        }
    }
}
