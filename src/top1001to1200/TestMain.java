package top1001to1200;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

    private static void test1021() {
        String S = "(()())(())";
        String result = new Solution1021().removeOuterParentheses(S);
        System.out.println(result);
    }

    private static void test1108() {
        String address = "1.1.1.1";
        String result = new Solution1108().defangIPaddr(address);
        System.out.println(result);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test1021();
//        test1108();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
