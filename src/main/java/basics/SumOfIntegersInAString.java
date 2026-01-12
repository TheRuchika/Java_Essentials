package basics;

public class SumOfIntegersInAString {

    public static void main(String[] args) {

        //Approach one
        String input = "JAVA66 ESSENTAILSS 123";

        String numbers = input.replaceAll("\\D", "");

        System.out.println("Numbers in the string = " + numbers);

        int sum = 0;

        for (int i = 0; i < numbers.length(); i++) {
            sum = sum + Character.getNumericValue(numbers.charAt(i));
        }

        System.out.println("Sum of the numbers = " + sum);


        // Approach 2
        String input2 = "JAVA66 ESSENTAILSS 123";
        int total = 0;

        for (int y = 0; y < input2.length(); y++) {
           char character = input2.charAt(y);
            if(Character.isDigit(character)){
                total = total + Character.getNumericValue(character);
            }
        }

        System.out.println("Approach 2 :" +total);
    }
}