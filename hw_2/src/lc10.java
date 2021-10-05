import java.util.*;
public class lc10 {
    public static void main(String[] args) {
        char[] ch1=new char[]{'a','a','b','b','c','c','c'};
        char[] ch2=new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int ans1=compress(ch1);
        int ans2=compress(ch2);
        System.out.println(ans1);
        System.out.println(ans2);
        for(int i=0;i<ans1;i++){
            System.out.print(ch1[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<ans2;i++){
            System.out.print(ch2[i]+" ");
        }
        //System.out.println(" ");


    }
    public static int compress(char[] chars) {
        int count = 1;
        int writeIndex = 0;

        for (int i=1; i <= chars.length; i++) {

            if ( i == chars.length || chars[i] != chars[i-1]) {
                chars[writeIndex++] = chars[i-1];
                //if count > 1 then only add count to char
                if (count > 1) {
                    //if count > 9 then need to add each digit
                    if (count > 9) {
                        List<Integer> list = new LinkedList<>();
                        while (count != 0) {
                            list.add(0,count % 10);
                            count = count/10;
                        }

                        for(int k=0; k < list.size(); k++) {
                            chars[writeIndex++] = (char) ('0' + list.get(k));
                        }

                    }else {
                        chars[writeIndex++] = (char) ('0' + count);
                    }
                }
                count = 1;
            }else {
                count++;
            }
        }
        return writeIndex;
    }
}
