import java.util.*;
public class question2 {
    public static void main(String[] args) {
        int[] arr1=new int[]{-4,-1,0,3,10};
        int[] arr2=new int[]{-7,-3,2,3,11};
        int[] ans1=square(arr1);
        int[] ans2=square(arr2);
        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]);
            System.out.print(' ');
        }
        System.out.println();
        for(int j=0;j<ans1.length;j++){
            System.out.print(ans2[j]);
            System.out.print(' ');
        }
    }
    public static int[] square(int[] nums){
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
    return res;
    }
}
