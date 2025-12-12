package basics.arrays;

public class FindMinMax {

    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 3, 5, 4, 2, 7, 10, 0};
        findMinMax(arr);
    }


    public static void findMinMax(int[] arr) {
        int minNum = 0;
        int maxNum = 10;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minNum){
                minNum = arr[i];
            }
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
            System.out.println("The Minimum Number "+minNum);
            System.out.println("The Maximum Number "+maxNum);
    }

//    ✅ Notes:
//
//    Time Complexity: O(n) → iterate once through array
//
//    Space Complexity: O(1) → no extra array used
//
//    Works for negative numbers as well

}
