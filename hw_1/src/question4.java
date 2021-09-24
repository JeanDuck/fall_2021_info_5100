import java.util.*;
public class question4 {
    public static void main(String[] args) {
        String a1="a";
        String b1="b";
        String a2="aa";
        String b2="ab";
        String a3="aa";
        String b3="aab";
        boolean res1=canConstruct(a1,b1);
        boolean res2=canConstruct(a2,b2);
        boolean res3=canConstruct(a3,b3);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
    public static boolean canConstruct(String ransomNote,String magazine){
        Map<Character,Integer> cntMap=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            cntMap.put(magazine.charAt(i),cntMap.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int j=0;j<ransomNote.length();j++){
            char ch=ransomNote.charAt(j);
            if(!cntMap.containsKey(ch)) return false;
            if(cntMap.get(ch)>0){
                cntMap.put(ch,cntMap.get(ch)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
