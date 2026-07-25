public class maxConsEven {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 12, 3, 10, 5, 12};

        int count =0;
        int maxConsEven=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                count++;
            }
            else count=0;

            if (count>maxConsEven){
                maxConsEven =count;
            }
        }
        System.out.println("maxConsEven: "+maxConsEven);
    }
}
