package twoPointerPattern_QuesPractice.oppositeDirection;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 11, 15};

        int target = 15;
        int i=0;
        int j=nums.length-1;

        while (i<j){
            int sum = nums[i]+nums[j];
           if(sum>target){
               j--;
           } else if (sum<target) {
               i++;
           } else {
               System.out.println(i+" "+j);
               break;

           }
        }
    }
}

//T.C = O(n) & S.C = O(1)