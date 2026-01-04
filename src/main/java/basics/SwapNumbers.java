package basics;

public class SwapNumbers {
    public static void main (String[] args){
        int a = 10;
        int b = 20;

        System.out.println("Before swapping values: "+ a +" " +b);


        //Using third variable
        int c = a;
        a = b ;
        b = c ;
        System.out.println("Swapped values: "+ a +" " +b);

        System.out.println();
        System.out.println();


        //Using + and - without third variable
        int d = 10;
        int e = 20;

        System.out.println("Before swapping values: "+ d +" " +e);
        d = d + e; //10+20 = 30
        e = d - e; //30-20 = 10
        d = d - e;  //30-10 = 20

        System.out.println("Swapped values: "+ d +" " +e);

        System.out.println();
        System.out.println();

        // Using * and / without thrid variable
        int x = 10;
        int y = 20;

        System.out.println("Before swapping values: "+ x +" " +y);
        x = x * y;  //10 * 20 = 200
        y = x / y;  // 200 / 20 = 10
        x = x / y ; // 200 / 10 = 20

        System.out.println("Swapped values: "+ x +" " +y);


    }

}
