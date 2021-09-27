import java.util.*;

public class question3 {
    public static void main(String[] args) {
        int[] arr1=new int[]{2,3,4,2,2,3,5,7};
        int ans1=noRepeat(arr1);
        System.out.println(ans1);
    }
    public static int noRepeat(int[] nums){
        int res=0;
        Map<Integer,Integer> cntMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            cntMap.put(nums[i],cntMap.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(cntMap.get(nums[i])==1){
                res=nums[i];
                break;
            }
        }
        return res;
    }
}
