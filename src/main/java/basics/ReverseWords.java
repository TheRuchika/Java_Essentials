package basics;

public class ReverseWords {
    public static void main(String[] args) {
        String word = "Java Essentials Reverse Words";
        String rev = "";

        String[] splitword = word.split(" ");
        int count = splitword.length;

        System.out.println(count);

        for (int i = splitword.length-1; i>=0; i--){
            rev = rev + splitword[i] + " ";
        }
        System.out.println(rev);
    }
}
