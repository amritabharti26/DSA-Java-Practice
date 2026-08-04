import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

//        int freqCount;
//        boolean isduplicate = false;
//        for (int i = 0; i < nums1.length; i++) {
//            freqCount = 0;
//            for (int j = 0; j < nums1.length; j++) {
//                if (nums1[i] == nums1[j]) {
//                    freqCount++;
//                }
//            }
//            if (freqCount > 1) {
//                isduplicate = true;
//            } else isduplicate = false;
//        }
//        System.out.println(isduplicate);

                HashSet<Integer> set = new HashSet<>();

                for (int i = 0; i < nums.length; i++) {

                    if (set.contains(nums[i])) {
                        System.out.println(true);
                        return;
                    }

                    set.add(nums[i]);
                }

                System.out.println(false);
            }
        }



