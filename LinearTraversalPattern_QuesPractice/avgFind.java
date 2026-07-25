public class avgFind {
    public static void main(String[] args) {
        int [] arr = {1,6,2,4};
        int sum =0;
        double avg;

        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        avg = (double) sum/ arr.length;

        System.out.println("avg: "+ avg);
    }
}
