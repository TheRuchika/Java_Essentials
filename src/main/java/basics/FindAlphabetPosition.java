package basics;

import java.util.Scanner;

public class FindAlphabetPosition {

    public static void main(String[] args) {
        //Find the position of an English Alphabet

        //ASCII

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert English letter: ");
        char letter = scanner.next().charAt(0);

        letter = Character.toLowerCase(letter);

        int ASCIIValue = (int)letter;
        System.out.println(ASCIIValue);

        int position = ASCIIValue-96;
        System.out.println(position);

    }
}
