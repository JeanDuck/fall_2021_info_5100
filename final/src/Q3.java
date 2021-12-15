import java.util.*;
public class Q3 {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] nums, int k) {
            int n=nums.length;
            int sum=0;
            int cnt=0;
            Map<Integer,Integer> map=new HashMap<>();
            map.put(0,1);
            for(int i=0;i<n;i++){
                sum+=nums[i];
                if(map.containsKey(sum-k)){
                    cnt+=map.get(sum-k);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);

            }
            return cnt;
        }
}
