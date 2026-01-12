package basics;

public class CountNumberOfDigits {

    public static void main(String[] args) {
        int number = 123456789;
        String stringWithNumbers = "1223RU3CHIKA124124";
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Numbers in the integer are: " + count);


    //String
        int count2 = 0;
        for (int i = 0; i<stringWithNumbers.length(); i++){
            char numbers = stringWithNumbers.charAt(i);
            if(Character.isDigit(numbers)){
                count2++;
            }
        }
        System.out.println("Number count in the string: " +count2);
}


}
