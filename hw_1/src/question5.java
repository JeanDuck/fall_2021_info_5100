import java.util.*;
public class question5 {
    public static void main(String[] args) {
        String a1="1A3d4s5t";
        String a2="A2bb2d4";
        String a3="A22b2d4";
        boolean ans1=noFollow(a1);
        boolean ans2=noFollow(a2);
        boolean ans3=noFollow(a3);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

    }
    public static boolean noFollow(String str){
        for(int i=0;i<str.length()-1;i++){
            char ch1=str.charAt(i);
            char ch2=str.charAt(i+1);
            if(Character.isDigit(ch1)&&!Character.isDigit(ch2)){
                continue;
            }else if(!Character.isDigit(ch1)&&Character.isDigit(ch2)){
                continue;
            }else{
                return false;
            }
        }
        return true;

    }
}
