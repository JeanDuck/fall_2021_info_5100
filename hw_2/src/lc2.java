public class lc2 {
    public static void main(String[] args) {
        String[] str1=new String[]{"practice", "makes", "perfect", "coding", "makes"};
        String word1="coding";
        String word2="practice";
        String[] str2=new String[]{"practice", "makes", "perfect", "coding", "makes"};
        String word3="makes";
        String word4="coding";
        int ans1=shortestDistance(str1,word1,word2);
        int ans2=shortestDistance(str2,word3,word4);
        System.out.println(ans1);
        System.out.println(ans2);

    }
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int k=-1;
        int g=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                k=i;
            }
            if(wordsDict[i].equals(word2)){
                g=i;
            }
            if(k!=-1&&g!=-1){
                min=Math.min(min,Math.abs(k-g));

            }
        }
        return min;

    }
}
