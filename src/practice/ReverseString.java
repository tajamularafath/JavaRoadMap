package practice;

public class ReverseString {

    public static void main(String[] args) {

//    Input:
        String a = "apple";

        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.println(a.charAt(i));
        }

    }
}
