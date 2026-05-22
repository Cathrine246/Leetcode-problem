class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] result=new int[n];
         int left =0;
         int right=n-1;
         int k=n-1;
         while(left<=right){
            int leftsqr=nums[left]*nums[left];
            int rightsqr=nums[right]*nums[right];
             
             if(leftsqr>rightsqr){
                result[k]=leftsqr;
                left++;
             }
             else{
                result[k]=rightsqr;
                right--;
             }
             k--;
 }
      return result;
      }
}
