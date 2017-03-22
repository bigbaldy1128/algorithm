package algorithms;

import java.util.*;

/**
 * Created by wangjinzhao on 2017/3/21.
 */
public class Subsets {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        backTracing(res,new ArrayList<>(),nums,0);
        return res;
    }

    public void backTracing(List<List<Integer>> res,List<Integer> temp,int[] nums,int start)
    {
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backTracing(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
