package leetCode;

import java.util.*;

public class LeetCode {

    public static boolean isValid(String s) {
        Stack<Character> strStack = new Stack<>();
        for (Character i : s.toCharArray()) {
            if (i == '(') {
                strStack.push(')');
            } else if (i == '[') {
                strStack.push(']');
            } else if (i == '{') {
                strStack.push('}');
            } else if (strStack.isEmpty()) {
                return false;
            } else if (strStack.pop() != i) {
                return false;
            }
        }


        return strStack.isEmpty();
    }


    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                sum -= m.get(s.charAt(i));
            } else {
                sum += m.get(s.charAt(i));
            }
        }

        return sum;
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int i = 0;

        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        return s1.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};

        System.out.println(isValid("(([]){})"));

    }
}
