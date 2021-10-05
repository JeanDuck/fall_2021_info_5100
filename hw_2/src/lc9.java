import java.util.*;
public class lc9 {
    public static void main(String[] args) {
        String s1="the sky is blue";
        String s2="a good example";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
    }
    public static String reverseWords(String s) {
        s=s.trim();
        List<String> wordList=Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ",wordList);

    }
}
