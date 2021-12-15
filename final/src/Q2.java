import java.util.*;

public class Q2 {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();
            for(String str:strs){
                char[] cur=str.toCharArray();
                Arrays.sort(cur);
                if(!map.containsKey(String.valueOf(cur))){
                    map.put(String.valueOf(cur),new ArrayList<>());
                }
                map.get(String.valueOf(cur)).add(str);
            }
            List<List<String>> ans = new ArrayList<>();
            for(List<String> val:map.values()){
                ans.add(val);
            }
            return ans;

        }
}
