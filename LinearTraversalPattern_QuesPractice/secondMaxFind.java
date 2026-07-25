public class secondMaxFind {
    public static void main(String[] args) {
        int [] arr= {1,3,2,4};
        int Max1 = 0;
        int Max2 = 0;
        for (int i=0; i< arr.length;i++){
            if(Max1<= arr[i]){
                Max2 =Max1;
                Max1 = arr[i];
            } else if (Max2<=arr[i] && arr[i] != Max1) {
                Max2 = arr[i];
            }
        }
        System.out.println("1stMax:");
        System.out.println(Max1);

//        for (int j = 0; j < arr.length; j++){
//            if(Max2<=arr[j] && arr[j] != Max1){
//
//            }
//
//        }
        System.out.println("2ndMax:");
        System.out.println(Max2);
    }
}
