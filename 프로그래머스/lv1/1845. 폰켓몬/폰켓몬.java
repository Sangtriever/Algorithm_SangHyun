import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        if(hashSet.size() > nums.length/2){
            return nums.length/2;
        }else{
            return hashSet.size();
        }
    }
}