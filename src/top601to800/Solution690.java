package top601to800;

import construct.Employee;
import org.junit.Test;

import java.util.*;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 15:27
 **/
public class Solution690 {

    @Test
    public void test690() {
        Employee e1 = new Employee(1, 5, Arrays.asList(2, 3));
        Employee e2 = new Employee(2, 3, new ArrayList<>());
        Employee e3 = new Employee(3, 3, new ArrayList<>());
        List<Employee> employees = Arrays.asList(e1, e2, e3);
        System.out.println(getImportance(employees, 1));
    }

    Map<Integer, Employee> map = new HashMap<>();
    int result = 0;

    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        dfs(id);
        return result;
    }

    public void dfs(int id) {
        Employee e = map.get(id);
        result += e.importance;
        for (Integer n : e.subordinates) {
            dfs(n);
        }
    }
}
