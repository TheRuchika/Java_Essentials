package basics;

import java.util.*;

public class ReverseString {
    public static void main (String[] args)
    {
        // Length and charAT
        String str = "ABCD";

        for (int i=str.length()-1 ; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        //Character Array
        System.out.println();
        System.out.println();

        char[] strChar = str.toCharArray();
        int length = strChar.length;

        for(int i =length-1; i>=0; i--){
            System.out.print(strChar[i]);
        }

        System.out.println();
        System.out.println();

        //Using string buffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        System.out.println();
        System.out.println();

        //Using Collections

        char[] colChar = str.toCharArray();
        List<Character> list = new ArrayList<Character>();

        for (Character character : colChar) {
            list.add(character);
        }
            Collections.reverse(list);

            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()){

                System.out.print(listIterator.next());

            }

        }

    }


