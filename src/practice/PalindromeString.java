package practice;

public class PalindromeString {
    public static void main(String[] args) {

//        Check whether a string is palindrome
//        Input:
        String a = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i == a.length() / 2; i++){
            if (a.charAt(i) == a.charAt(a.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("IsPalindrome: "+ isPalindrome);
    }
}
