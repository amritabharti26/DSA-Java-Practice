package ArrayHashmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<nums.length; i++){

            // 1. Calculate complement
            int complement = target - nums[i];

            // 2. Check whether complement exists
            if(map.containsKey(complement)){

                //Returning old and current index
                return new int[]{map.get(complement), i};
            }
            // 3. Store current number and its index
                map.put(nums[i], i);

        }

        return new int[]{};
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

}
