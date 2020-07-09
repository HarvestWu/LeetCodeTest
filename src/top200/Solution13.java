package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 14:28
 **/
public class Solution13 {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0, len = chars.length;
        for (int i = 0; i < len; i++) {
            switch (chars[i]) {
                case 'I':
                    if (i + 1 < len && chars[i + 1] == 'V') {
                        result += 4;
                        i++;
                    } else if (i + 1 < len && chars[i + 1] == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i + 1 < len && chars[i + 1] == 'L') {
                        result += 40;
                        i++;
                    } else if (i + 1 < len && chars[i + 1] == 'C') {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i + 1 < len && chars[i + 1] == 'D') {
                        result += 400;
                        i++;
                    } else if (i + 1 < len && chars[i + 1] == 'M') {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    public int romanToInt1(String s) {
        int result = 0;
        int pre = 0;
        for (char c : s.toCharArray()) {
            int curr = getValue(c);
            result += pre < curr ? -pre : pre;
            pre = curr;
        }
        result += pre;
        return result;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
