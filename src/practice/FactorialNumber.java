package practice;

public class FactorialNumber {
    public static void main(String[] args) {

        ///  Using For Loop
        int a = 5;
        int total = 1;
        for (int i = 1; i<=a; i++){
            total = total * i;
        }
        System.out.println("total "+total);


        ///  Using While Loop
        while (a>5){
            int j = 1;
            total = total * j;
            j++;
        }
        System.out.println("total => "+total);

    }
}
