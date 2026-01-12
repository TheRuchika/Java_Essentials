package basics;

public class CountLetterCountInAString {

    public static void main(String[] args) {

        //Using Iteration
        String input = "RuchikAAaa Pramodya";
        char toFind = 'a';

        input = input.toLowerCase();

        int count = 0;

        char[] charInput = input.toCharArray();

        for (int i = 0; i<charInput.length; i++ ){
            if(charInput[i] == toFind){
                count = count + 1;
            }
        }
        System.out.println(count);

        //Using without Iteration
        input = input.toUpperCase();
        String charToFind = Character.toString(toFind).toUpperCase();

        int actualLength = input.length();
        input = input.replace(charToFind, "");
        int lengthAfterReplace = input.length();

        int letterCount = actualLength - lengthAfterReplace;

        System.out.println(letterCount);
    }
}
