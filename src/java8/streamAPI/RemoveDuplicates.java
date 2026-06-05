package java8.streamAPI;

import collections.set.treeset.comparator.Employee;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


        /// Removing Duplicate using filter method
        List<Integer> numList = Arrays.asList(10,100,20,101,99,4,2,4,6,1);
        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> sortedList = numList.stream()
                .filter(set::add)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("sortedList "+sortedList);

        ///  Convert Names to Uppercase
        List<String> names = Arrays.asList("colan", "infotech", "chennai");

        List<String> upperCase = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("upperCase "+upperCase);

        ///  Count Names Starting with "A"
        List<String> strName = Arrays.asList("Aman", "Rahul", "Ajay", "Ankit");

        List<String> countString = strName.stream()
                .filter(k -> k.startsWith("A"))
                .toList();
        System.out.println("countString "+countString);


    /// Group Employees by Department
    List<Employee> employees = Arrays.asList(
            new Employee(1,"Umar",2000),
            new Employee(2,"Ali",2500),
            new Employee(5,"Abu",2000)
    );
    Map<Double, List<Employee>> groupEmp = employees.stream()
            .collect(Collectors.groupingBy(Employee::getSalary));

        System.out.println("Group Employees  "+groupEmp);

    }
}
