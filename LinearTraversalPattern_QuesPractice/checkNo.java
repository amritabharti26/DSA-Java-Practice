import nextPractice.ConpectOfString;

import java.util.Scanner;

public class checkNo {
    public static void main(ConpectOfString[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("enter num: ");
//        int num = sc.nextInt();
//        if(num<0){
//            System.out.println("no is -ve");
//        }
//        else{
//            System.out.println("no. is +ve");
//        }
//        if(num%2==0){
//            System.out.println("no is even");
//        }
//        else{
//            System.out.println("no. is odd");
//        }
        System.out.print("ENTER year : ");
        int year = sc.nextInt();

        if(year%4==0){ //modulus('%') give the remainder while ('/')division give quotient
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("Year is NOT leap year");
        }

    }
}
