package basics.arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[] arr = {1,8,6,2,0,9,4,7,2,6,3,5};
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;

        double[] arrDouble = {1.2, 1.1, 1.0, 1.9, 1.5, 1.4, 1.6, 1.3};

        char[] arrChar = {'a', 'e', 'i', 'o', 'u'};

        String[] arrString = {"Apple", "Mango", "Banana", "Grape", "Jack", "Guava"};

            System.out.print("Int[] => ");
        for(int arr1: arr){
            System.out.print(arr1);
        }
    }
}
