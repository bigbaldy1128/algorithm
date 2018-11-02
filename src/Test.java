import exercise.MyExercise;

import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by wangjinzhao on 2017/3/16.
 */
public class Test {

    public static void main(String... args) {
        //int[] a = {7, 3, 1, 2, 8, 10, 22};
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


}
