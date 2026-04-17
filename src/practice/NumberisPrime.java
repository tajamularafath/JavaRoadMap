package practice;

import java.util.Scanner;

public class NumberisPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isPrime = true;

        if(a<=1) {
            isPrime = false;
        }
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                System.out.println("Is Prime " + a);
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}

//for (int i = 2; i <= a; i++) {
//
//        if (a % i == 0) {
//        System.out.println("Is Prime " + a);
//            } else {
//                    System.out.println("Not Prime");
//            }
//                    }
