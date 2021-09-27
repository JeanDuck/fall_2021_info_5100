import java.util.*;

public class question1 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,2};
        int[] arr2=new int[]{1,1,1,1,1};
        int[] arr3=new int[]{1,2,3,4,5};
        int[] arr4=new int[]{-1,-1,-1,2,2,3,4,-2};
        int ans1=sum(arr1);
        int ans2=sum(arr2);
        int ans3=sum(arr3);
        int ans4=sum(arr4);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
    public static int sum(int[] nums){
        int res=0;
        Map<Integer,Integer> cntMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!cntMap.containsKey(nums[i])){
                res+=nums[i];
                cntMap.put(nums[i],1);
            }else{
                if(cntMap.get(nums[i])==1) {
                    res-=nums[i];
                    cntMap.put(nums[i],cntMap.get(nums[i])+1);
                }
            }
        }
        return res;
    }
}
