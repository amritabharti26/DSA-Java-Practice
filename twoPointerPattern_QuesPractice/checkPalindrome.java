package twoPointerPattern_QuesPractice;

public class checkPalindrome {
    public static void main(String[] args) {
        String word = "LEVEL";
//        char [] ch = word.toCharArray();

        int i =0;
        int j =word.length()-1;
        boolean isPalindrome = true;

        while (i<j){
            if (word.charAt(i) != word.charAt(j)){
                isPalindrome =false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);

    }
}

//T.C = O(n) & S.C = O(1) no extra arr is creating