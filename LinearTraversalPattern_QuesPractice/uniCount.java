public class uniCount {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3,2,5};
        int uniCount =0;
        int freqCount;
        for (int i=0; i< arr.length; i++) {
            freqCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freqCount++;
                }

            }
            if (freqCount==1) {
                uniCount++;
            }

        }
            System.out.println("uniCount: "+ uniCount);
    }
}
