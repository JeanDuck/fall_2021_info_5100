import java.util.HashMap;
import java.util.Map;


public class Q3 {
    public static void main(String[] args) {
        int[] nums1=new int[]{1,3,-1,3,4,-1};
        int res1= repeatSum(nums1);
        System.out.println(res1);

    }
    public static int repeatSum(int[] array){
        Map<Integer,Integer> visit=new HashMap<>();
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(!visit.containsKey((array[i]))){
                visit.put(array[i],0);
            }
            visit.put(array[i],visit.get(array[i])+1);
        }
        for(int val:visit.keySet()){
            int times=visit.get(val);
            if(times>=2){
                sum+=val;
            }
        }
        return sum;
    }
}
