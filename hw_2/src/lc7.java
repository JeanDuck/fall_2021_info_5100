import  java.util.*;
public class lc7 {
    public static void main(String[] args) {
        String num1="11";
        String num2="123";
        String num3="456";
        String num4="77";
        System.out.println(addStrings(num1,num2));
        System.out.println(addStrings(num3,num4));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder res=new  StringBuilder();
        int len1=num1.length();
        int len2=num2.length();
        int carry=0;
        int i=len1-1;
        int k=len2-1;
        while(i>=0||k>=0){
            int x=i>=0?num1.charAt(i)-'0':0;
            int y=k>=0?num2.charAt(k)-'0':0;
            int temp=x+y+carry;
            if(temp>9){
                temp=temp%10;
                carry=1;
            }else{
                carry=0;
            }

            res.append(temp);
            i--;
            k--;
        }
        if(carry>=1){
            res.append(1);
        }
        return res.reverse().toString();

    }
}
