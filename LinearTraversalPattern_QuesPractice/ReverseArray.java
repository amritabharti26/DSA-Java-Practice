import nextPractice.ConpectOfString;

public class ReverseArray {
    public static void main(ConpectOfString[] args) {
        int[] arr = {7,1,4,0,6};
        int i=0, j= arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
            for (i =0; i< arr.length; i++){
                System.out.print(arr[i]+" ");
            }
    }
}
