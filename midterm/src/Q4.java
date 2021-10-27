import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        String s= "abcabcbb";
        String s2="abcdefga";

        String res=findLongest(s);
        String res2=findLongest(s2);
        System.out.println(res);
        System.out.println(res2);

    }
    public static String findLongest(String s){
        int left=0;
        int right=0;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        String res="";
        int ans=Integer.MIN_VALUE;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left=map.get(ch);
            }
            if(ans<right-left+1){
                ans=right-left+1;
                res=s.substring(left,right+1);
            }
            map.put(ch,right+1);
            right++;
        }
        return res;
    }
}
