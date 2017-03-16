package algorithms;

/**
 * Created by wangjinzhao on 2017/3/16.
 */
public class HeapSort {
    public void heapSort(int[] nums)
    {
        buildMaxHeap(nums);
        for(int i=nums.length-1;i>0;i--)
        {
            int temp= nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            maxHeapify(nums,0,i);
        }
    }

    public void buildMaxHeap(int[] nums)
    {
        for(int i=nums.length/2;i>=0;i--)
        {
            maxHeapify(nums,i,nums.length);
        }
    }

    public void maxHeapify(int[] nums,int i,int heapSize) {
        int left=2*i;
        int right=2*i+1;
        int largest;
        if(left<heapSize && nums[left]>nums[i])
        {
            largest=left;
        }
        else
        {
            largest=i;
        }
        if(right<heapSize && nums[right]>nums[largest])
        {
            largest=right;
        }
        if(largest!=i)
        {
            int temp=nums[i];
            nums[i]=nums[largest];
            nums[largest]=temp;
            maxHeapify(nums,largest,heapSize);
        }
    }
}
