package practice;

public class SwapNumber {

    public static void main(String[] args) {

        ///  With temp Variable
        int a = 10;
        int b = 20;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+ a+" B:" + b);

        ///  Without temp Variable
        a = a+b;
        a = a - b;
        b = a - b;
        System.out.println("a: "+ a+" B:" + b);

    }
}
