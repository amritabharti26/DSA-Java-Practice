public class duplicatecount {
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,3,2,5};
            int dupCount =0;
            int freqCount;
            for (int i=0; i< arr.length; i++) {
                boolean duplicate = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        duplicate = true;
                        break;
                    }
                }
                freqCount = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        freqCount++;
                    }
                }

                if (freqCount > 1 && !duplicate) {
                    dupCount++;
                }

            }
            System.out.println("dupCount: "+ dupCount);
        }

}
