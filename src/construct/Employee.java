package construct;

import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 15:28
 **/
public class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
