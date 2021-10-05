import java.util.Arrays;

public class lc6 {
    public static void main(String[] args) {
        String s1="egg";
        String s2="add";
        String s3="foo";
        String s4="bar";
        System.out.println( isIsomorphic(s1,s2));
        System.out.println( isIsomorphic(s3,s4));


    }
    public static boolean isIsomorphic(String s, String t) {
        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);
        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(mappingDictStoT[c1]==-1&&mappingDictTtoS[c2]==-1){
                mappingDictStoT[c1]=c2;
                mappingDictTtoS[c2]=c1;
            }else if(!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)){
                return false;
            }
        }
        return true;

    }
}
