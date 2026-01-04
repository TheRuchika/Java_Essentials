package Interview;

public class StarPatternPrinting {

    public static void main(String[] args) {

        int n = 5;

        //Square
        System.out.println("Square");
        for (int i = 1; i <= n; i++) {

            for (int y = 1; y <= n; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        //Increasing triangle
        System.out.println("Increasing Triangle");
        for (int i = 1; i <= n; i++) {

            for (int y = 1; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();


        //Decreasing triangle
        System.out.println("Decreasing triangle");

        for (int i = 1; i <= n; i++) {

            for (int y = i; y <= n; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        System.out.println("Right sided triangle");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Right sided triangle");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Hill pattern");

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Reverse hill pattern");

        for (int i = 1; i <= n; i++) {
            for(int y =  1; y <= i; y++){
                System.out.print("  ");
            }
            for(int y = i; y < n; y++){
                System.out.print("* ");
            }
            for(int y = i; y <= n; y++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}


