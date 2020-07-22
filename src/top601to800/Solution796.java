package top601to800;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 20:31
 **/
public class Solution796 {

    @Test
    public void test796() {
        assertTrue(rotateString("abcd", "bcda"));
    }

    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
