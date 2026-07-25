public class posNegCount {
    public static void main(String[] args) {
        int [] arr ={1,0,-3,-4,6,-8};
        int posCount =0;
        int negCount =0;

        for (int i=0; i< arr.length; i++){
            if(arr[i]>0){
                posCount++;
            }else if (arr[i]<0)negCount++;
        }

        System.out.println("posCount: "+posCount);
        System.out.println("negCount: "+negCount);
    }
}
