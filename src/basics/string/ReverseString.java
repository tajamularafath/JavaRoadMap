package basics.string;

public class ReverseString {
    public static void main(String[] args) {
        String ste = "Hello";
        reverseString(ste);
    }




    public static void reverseString(String str) {
//        char[] chr = charAt(str);
        for (int i = str.length() -1 ; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
