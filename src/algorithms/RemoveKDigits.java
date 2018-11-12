package algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by wangjinzhao on 2018/11/12
 */
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        //corner case
        if (k == len)
            return "0";
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < num.length(); i++) {
            //whenever meet a digit which is less than the previous digit, discard the previous one
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        // corner case like "1111"
        while (k > 0) {
            stack.pop();
            k--;
        }
        while (!stack.isEmpty() && stack.getLast().equals('0')) {
            stack.pollLast();
        }
        return stack.stream().map(Object::toString).reduce((x, y) -> y + x).orElse("0");
    }
}
