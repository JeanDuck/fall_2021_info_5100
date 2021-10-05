public class lc3 {
    public static void main(String[] args) {
        int[] nums1=new int[]{0,1,0,3,12};
        int[] nums2=new int[]{0};
        moveZeroes(nums1);
        moveZeroes(nums2);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]+" ");
        }



    }
    public static  void moveZeroes(int[] nums) {
        int lastNonZero=0;
        for(int cur=0;cur<nums.length;cur++){
            if(nums[cur]!=0){
                int temp=nums[cur];
                nums[cur]=nums[lastNonZero];
                nums[lastNonZero++]=temp;
            }
        }
    }

}
