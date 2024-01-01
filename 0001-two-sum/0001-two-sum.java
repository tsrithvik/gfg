class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];
        int j=0;
        while(j<nums.length){
            for(int i=j+1;i<nums.length;i++){
                if(nums[i]+nums[j]== target){
                    arr[0]= j;
                    arr[1]= i;
                    
                }
        }
        j++;
        }
        return arr;
    }
}