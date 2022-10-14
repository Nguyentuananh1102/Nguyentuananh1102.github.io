class Solution {
    public static int pivotIndex(int[] nums) {
      int leftsum =0;
        int total =0;
        for(int i =0;i< nums.length;i++){
            total += nums[i];
        }
        for(int i =0;i<nums.length;i++){
            int rightsum = total - nums[i]- leftsum;
            if(rightsum==leftsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        System.out.print("nums : ");
        System.out.println(pivotIndex(nums));
        int [] nums1 = {1,2,3};
        System.out.print("nums1 : ");
        System.out.println(pivotIndex(nums1));
        int [] nums2 = {2,1,-1};
        System.out.print("nums2 : ");
        System.out.println(pivotIndex(nums2));
    }
}