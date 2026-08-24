class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
            if(nums[i] == target){
                return i;
            }
        }
    for(j=0;j<n;j++){
        if(nums[j]> target){
            return j;
        }

    }
    return i;
}
}