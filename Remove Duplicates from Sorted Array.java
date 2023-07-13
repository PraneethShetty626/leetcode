import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> res =  new ArrayList<>();

        for(int i:nums){
            if(!res.contains(i)){
                res.add(i);
            }
        }

        int i=0;

        for(int k:res){
            nums[i++]=k;
        }

        return i;
    }
}