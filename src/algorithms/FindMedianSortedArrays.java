package algorithms;

/**
 * Created by wangjinzhao on 2018/11/5
 */
public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] a, int[] b) {
        int length = a.length + b.length;
        int l = (length + 1) / 2;
        int r = (length + 2) / 2;

        return (getKMin(a, 0, b, 0, l) + getKMin(a, 0, b, 0, r)) * 1.0 / 2;
    }

    private static int getKMin(int[] a, int aStart, int[] b, int bStart, int k) {
        if (aStart > a.length - 1) {
            return b[bStart + k - 1];
        }
        if (bStart > b.length - 1) {
            return a[aStart + k - 1];
        }
        if (k == 1) {
            return Math.min(a[aStart], b[bStart]);
        }

        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (aStart + k / 2 - 1 < a.length) {
            aMid = a[aStart + k / 2 - 1];
        }
        if (bStart + k / 2 - 1 < b.length) {
            bMid = b[bStart + k / 2 - 1];
        }

        return aMid < bMid ? getKMin(a, aStart + k / 2, b, bStart, k - k / 2) : getKMin(a, aStart, b, bStart + k / 2, k - k / 2);
    }

}
