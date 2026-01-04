package basics;

import java.util.HashMap;

public class LetterCount {

    public static void main(String[] args) {

        countLetters("RUCHIKAAA");
    }
    public static void countLetters(String typed_name){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        char[] charName = typed_name.toCharArray();

        for (Character c : charName){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }


}
