package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-14 13:52
 **/
public class Solution443 {

    @Test
    public void test443(){
        char[] chars = "a".toCharArray();
        System.out.println(compress(chars));
        System.out.println(chars);
    }

    public int compress(char[] chars) {
        char curr = chars[0];
        int p = 0,count=0;
        for (int i = 0;i<chars.length;i++){
            if (chars[i] != curr){
                chars[p++] = curr;
                if (count>1){
                    char[] cs = String.valueOf(count).toCharArray();
                    for (char c:cs){
                        chars[p++] = c;
                    }
                }
                count =1;
                curr = chars[i];
            }else{
                count++;
            }
        }
        chars[p++] = curr;
        if (count>1){
            char[] cs = String.valueOf(count).toCharArray();
            for (char c:cs){
                chars[p++] = c;
            }
        }
        return p;
    }
}
