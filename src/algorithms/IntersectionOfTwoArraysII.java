package algorithms;

import java.util.*;

/**
 * Created by wangjinzhao on 2017/3/24.
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:
 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.
 Follow up:
 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: nums2)
        {
            if(map.containsKey(num))
            {
                if(map.get(num)>0)
                {
                    res.add(num);
                    map.put(num,map.get(num)-1);
                }
            }
        }
        return res.stream().mapToInt(p->p).toArray();
    }
}
