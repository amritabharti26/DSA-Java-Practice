public class arrSortCheck {
    public static void main(String[] args) {
        int [] arr = {1,5,3,4};
        boolean isSortArr = true;

        for (int i=0; i< arr.length-1; i++){
            if (arr[i] > arr[i + 1]) {
                isSortArr = false;
                break;
            }
        }

        System.out.println("isSortArr: "+ isSortArr);
    }
}
