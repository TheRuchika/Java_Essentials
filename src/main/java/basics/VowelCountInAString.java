package basics;

public class VowelCountInAString {

    public static void main(String[] args) {
        String input = "Javaa Essentials OOOOOOO uUUU";
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        input = input.toLowerCase();

        //Each vowel
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                countA++;
            } else if (input.charAt(i) == 'e') {
                countE++;
            } else if (input.charAt(i) == 'i') {
                countI++;
            } else if (input.charAt(i) == 'o') {
                countO++;
            } else if (input.charAt(i) == 'u') {
                countU++;
            }
        }
        System.out.println("A count is :" + countA);
        System.out.println("E count is :" + countE);
        System.out.println("I count is :" + countI);
        System.out.println("O count is :" + countO);
        System.out.println("U count is :" + countU);

        System.out.println();
        System.out.println();

        //All together vowel(s) count
        int allCount = 0;

        for(int y=0; y<input.length(); y++){
            if (input.charAt(y)=='a' ||input.charAt(y)=='e'||input.charAt(y)=='i'||input.charAt(y)=='o'||input.charAt(y)=='u'){
                allCount++;
            }
        }
        System.out.println("Vowels exists in the sentence is: "+allCount);
    }
}
