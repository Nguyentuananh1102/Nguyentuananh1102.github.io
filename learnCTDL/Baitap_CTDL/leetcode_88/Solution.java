class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int[] arr = new int[length];
        int t = 0;
        for (int i = m; i < length; i++) {
            nums1[i] = nums2[t++];
        }
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if(nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}