package twoPointerPattern_QuesPractice.sameDirection;

import java.util.Arrays;

public class duplicateRemove {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,4};
        int i=0;
        for (int j=1; j<arr.length; j++){
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Unique count = " + (i + 1));


        for (int k =0; k<=i; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
