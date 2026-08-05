package twoPointerPattern_QuesPractice.sameDirection;

public class countEachNo {
    public static void main(String[] args) {

        int [] arr = {2, 0, 2, 1, 1, 0};
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (int i = 0; i < arr.length; i++) {

            // your code here

            if(arr[i] ==0){
                zeroCount++;
            } else if (arr[i] == 1) {
                oneCount++;
            }
            else twoCount++;

        }

        System.out.println( zeroCount + " "+ oneCount+ " "+twoCount);
    }
}
