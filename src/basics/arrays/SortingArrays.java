package basics.arrays;

public class SortingArrays {
    public static void main(String[] args) {

        ///  Sorting Integer
        int[] arr = {2, 9, 3, 8, 4, 8, 5, 7, 6, 1, 10};
        sortingInteger(arr);

        ///  Sorting String
        String[] arrStr = new String[]{"a","z","y","b","d"};
        sortingString(arrStr);
    }

    ///  Sorting Integer
    public static void sortingInteger(int[] arr) {
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    ;
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array Integers ");
        for (int k = 0; k < arr.length - 1; k++) {
            System.out.print(arr[k]);
        }
    }

    ///  Sorting String
    public static void sortingString(String[] arr) {
        String temp;
        for (int i = 0; i <= arr.length -1; i++) {
            for ( int j = i+1; j<= arr.length -1; j++){
                if (arr[i].equals(arr[j])){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array String ");
        for (int k = 0; k < arr.length - 1; k++) {
            System.out.print(arr[k]);
        }
    }



}
