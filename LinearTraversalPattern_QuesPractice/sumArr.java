public class sumArr {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4};
        int sum =0;
        for (int i=0; i< arr.length; i++){
            sum+=arr[i];
        }

        System.out.println("sum of array: " + sum);

        int Evencount =0;
        int Oddcount =0;
        for (int j=0; j<arr.length; j++){
            if (arr[j]/2 ==0)
                Evencount =arr[j];
            else if (arr[j]/2 != 0)
                Oddcount = arr[j];
        }
        System.out.println("even count "+Evencount + "odd count "+Oddcount);

    }
}
