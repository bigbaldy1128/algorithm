import algorithms.*;
import exercise.MyExercise;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by wangjinzhao on 2017/3/16.
 */
public class Test {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String... args) {
//        int[] a = {7, 3, 1, 2, 8, 10, 22};
//        Arrays.stream(a).forEach(System.out::println);
        System.out.println(new RemoveKDigits().removeKdigits("10",1));
    }


}
