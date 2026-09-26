package twoPointerPattern_QuesPractice.oppositeDirection;

public class vowelsCheck {
    public static void main(String[] args) {
        String str = "COMPUTER SCIENCE";


        int count =0;

        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == 'A' ||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'|| str.charAt(i) == 'U') {
                count++;
            }
        }

        for(int i=0; i< str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(str.charAt(i) == 'A' ||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'|| str.charAt(i) == 'U') {
                count++;
            }
        }


        System.out.println(count);

    }
}
