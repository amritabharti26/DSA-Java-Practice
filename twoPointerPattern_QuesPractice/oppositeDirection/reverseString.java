package twoPointerPattern_QuesPractice.oppositeDirection;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String name = "Amrita";
        char [] ch = name.toCharArray();

        int i = 0;
        int j = ch.length-1;

        while (i<j){
         char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        System.out.println("reverseString: "+ Arrays.toString(ch));

        System.out.println("reverseString: "+ new String(ch));
    }
}
