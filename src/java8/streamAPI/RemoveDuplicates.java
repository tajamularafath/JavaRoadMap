package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,3,2,1);

        List<Integer> removeDuplicateList = ls.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(removeDuplicateList);


        List<Integer> evenNum = ls.stream()
                .filter(n -> n%2 == 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("EvenNumbers "+ evenNum);
    }
}
