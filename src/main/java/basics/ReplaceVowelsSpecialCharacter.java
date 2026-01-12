package basics;

public class ReplaceVowelsSpecialCharacter {



    public static void main(String[] args) {
        String givenText = "JAVA ESSENTIALSSS";
 /*
    Approach 01
    1. Input = "JAVA ESSENTIALSSS"
    2. Convert String to Character Array
    3. Calculate the length of the String and Iterate
    4.Inside the loop check char(index) == vowel
    5. If found vowel assign value *
    6. outside the loop iterate again print the new value

  */
        char[] charArray = givenText.toCharArray();

        for(int i = 0; i<givenText.length(); i++){
            if (givenText.charAt(i)=='A' || givenText.charAt(i)=='E' || givenText.charAt(i)=='I' || givenText.charAt(i)=='O' || givenText.charAt(i)=='U' ||
                    givenText.charAt(i)=='a' || givenText.charAt(i)=='e' || givenText.charAt(i)=='i' || givenText.charAt(i)=='o' || givenText.charAt(i)=='u')

                charArray[i] = '*';
        }

        for(int i = 0; i<givenText.length(); i++) {
            System.out.print(charArray[i]);
        }

        System.out.println();


        /*
            Approach 02
            1. Using replace all String method
             */

        String newText = "JAAAAVAAA ESSEENTIIALSSS";
        String replaceText = newText.replaceAll("[AEIOUaeiou]","@");
        System.out.println(replaceText);

    }


    }
