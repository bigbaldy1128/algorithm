package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangjinzhao on 2017/3/24.
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        for(int num: nums2)
        {
            if(set.contains(num))
            {
                res.add(num);
            }
        }
        return res.stream().mapToInt(p->p).toArray();
    }
}
