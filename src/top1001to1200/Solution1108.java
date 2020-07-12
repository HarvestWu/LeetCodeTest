package top1001to1200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:46
 **/
public class Solution1108 {

    @Test
    public void test1108() {
        String address = "1.1.1.1";
        String result = defangIPaddr(address);
        System.out.println(result);
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
