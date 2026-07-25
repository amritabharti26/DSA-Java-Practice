public class freqCount {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3,2,5};
        int freqCount;
        for (int i=0; i< arr.length; i++){
            freqCount = 0;
            for (int j=0; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    freqCount++;
                }

            }
            System.out.println(arr[i] + "  freqCount: "+ freqCount);

        }



    }
}
