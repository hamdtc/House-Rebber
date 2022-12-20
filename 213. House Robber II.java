class Solution {
    public int rob(int[] nums) {
       // here we have to store max value up to the element and before;
        
        //consider in a circle
        
        if(nums.length<2) return nums[0];
        int last=0; //secont max or max upto last element
        int first=0; //first max -max till second last element
        
        
        //now go through the array and add each house and maximize
        //here only upto 0 to n-1 or 1 to n so find both and maximize
        for(int i=0; i<nums.length-1;i++){  
            int temp=last;
            last=Math.max(last,first+nums[i]);
            System.out.print(nums[i]);
            first=temp;
        }
        int finall=last;
       // System.out.print(last);
        last=0;
        first=0;
        for(int i=1; i<nums.length;i++){  
            int temp=last;
            last=Math.max(last,first+nums[i]);
            first=temp;
        }
        //final answer should be max of both
        
        finall=Math.max(last,finall);
        
        
        return finall;
    }
} 
