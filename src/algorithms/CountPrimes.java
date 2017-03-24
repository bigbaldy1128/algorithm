package algorithms;

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

/**
 * Created by wangjinzhao on 2017/3/24.
 * Description:
 * <p>
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Credits:
 * Special thanks to @mithmatt for adding this problem and creating all test cases.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int res = 0;
        boolean[] f = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!f[i]) {
                res++;
                for (int j = 2; i * j < n; j++) {
                    f[i * j] = true;
                }
            }
        }
        return res;
    }
}
