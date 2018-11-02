import exercise.MyExercise;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by wangjinzhao on 2017/3/16.
 */
public class Test {

    public static void main(String... args) {
        int[] a = {7, 3, 1, 2, 8, 10, 22};
        new MyExercise().sort(a);
        IntStream.of(a).forEach(System.out::println);
    }


}
