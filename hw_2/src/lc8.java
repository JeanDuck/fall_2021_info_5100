public class lc8 {
    public static void main(String[] args) {
        String s1="A man, a plan, a canal: Panama";
        String s2="race a car";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));

    }
    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }

        return true;
    }
}
