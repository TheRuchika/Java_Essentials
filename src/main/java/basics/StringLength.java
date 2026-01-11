package basics;

public class StringLength {
    public static void main(String[] args) {
        String givenString = "JavaEssentials";

        //Using length
        System.out.println("Length of the array is: " + givenString.length());


        //Without length
        char[] charString = givenString.toCharArray();
        int i = 0;
        for (char string : charString){
            i++;
        }
        System.out.println("Length of the array is: " + i);
    }
}
