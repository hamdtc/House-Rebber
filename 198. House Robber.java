class Solution {
    public int rob(int[] nums) {
        // here we have to store max value up to the element and before;
        
        int last=0; //secont max or max upto last element
        int first=0; //first max -max till second last element
        
        
        //now go through the array and add each house and maximize
        for(int i: nums){  
            int temp=last;
            last=Math.max(last,first+i);
            first=temp;
        }
        return last;
    }
}