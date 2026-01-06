package collections.set.treeset.comparator;

import java.util.TreeSet;

public class TreesetComparator {
    public static void main(String[] args) {


        Employee e1 = new Employee(1,"Umar",10.00);
        Employee e2 = new Employee(3,"Ali",8.00);
        Employee e3 = new Employee(2,"Abdullah",5.00);

//        SortingEmployeesById id = new SortingEmployeesById();
        SortingEmployeesByName name = new SortingEmployeesByName();
        TreeSet<Employee> t = new TreeSet<Employee>(name);

        t.add(e1);
        t.add(e2);
        t.add(e3);



        for (Object emp: t){
            System.out.println(emp);
        }

    }

}
