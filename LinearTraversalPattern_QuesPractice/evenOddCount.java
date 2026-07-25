public class evenOddCount {
    public static void main(String[] args) {
        int [] arr = {1,6,2,4};
        int evenCount =0;
        int oddCount =0;

       for (int i=0; i<arr.length;i++){
           if(arr[i]%2 ==0){
               evenCount++;
           }
           else oddCount++;
       }

        System.out.println("evenCount: "+ evenCount);
        System.out.println("oddCount: "+ oddCount);
    }
}
