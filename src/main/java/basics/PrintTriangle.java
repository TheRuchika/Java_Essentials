package basics;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        //using **

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row and column count you want");

        int numberLines = scanner.nextInt();

        int row,columns = 0;

        for (row=1; row<=numberLines; row++){
            for (columns=1;columns<=row; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Using numbers

        System.out.println("Enter the row and column count you want");
        int numbers = scanner.nextInt();
        int number = 1;
        for (row=0; row<numbers; row++){
            for (columns=0;columns<row; columns++){
                System.out.print(" "+ number);
                number++;
            }
            System.out.println();
        }

    }

}
