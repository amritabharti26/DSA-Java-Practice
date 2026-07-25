import nextPractice.ConpectOfString;

import java.util.Scanner;

public class CountEvenValue {
    public static void main(ConpectOfString[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        int count = 0;
     for(int i =0; i<n; i++){
         if(arr[i]%2 ==0){
             count ++;
         }

     }
        System.out.println(count+" ");
    }
}
