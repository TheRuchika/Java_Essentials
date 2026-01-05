package basics;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");

        int number = scanner.nextInt();

        //Using Algorithm

        int rev = 0;
        while (number !=0){
            rev = rev * 10 + number%10;
            number = number/10;

        }
        System.out.println(rev);

        System.out.println();
        System.out.println();

        //Using String buffer

        System.out.println("Input number: ");
        int number2 = scanner.nextInt();

        StringBuffer revBuff;

        StringBuffer sb = new StringBuffer(String.valueOf(number2));
        revBuff = sb.reverse();

        System.out.println(revBuff);
    }
}
