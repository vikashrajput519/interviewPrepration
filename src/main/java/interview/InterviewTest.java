package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewTest {

    public static void main(String[] args) {


        List<Employee> emplyeeList = new ArrayList<>();
        Employee e4 = new Employee("Olivia Brown","+1912327326",7000, "Seattle");
        Employee e5 = new Employee("Peter Jones","+1912889326",2000, "San Francisco");
        Employee e6 = new Employee("Samantha Garcia","+19128300326",11000, "Rio De Janeiro");
        Employee e7 = new Employee("Kylie Williamss","+1912832126",3000, "San Francisco");
        Employee e8 = new Employee("Sandra Rodriguez","+19458347326",8000,"San Francisco");


        emplyeeList.add(new Employee("Richard Brown","+19128347326",6000, "Sydney"));
        emplyeeList.add(new Employee("John Davis","+191283473246",4000, "San Francisco"));
        emplyeeList.add(new Employee("Jonathan Miller","+19128237326",9000, "London"));
        emplyeeList.add(e4);
        emplyeeList.add(e5);
        emplyeeList.add(e6);
        emplyeeList.add(e7);
        emplyeeList.add(e8);

        Stream<Employee> employeeStream = emplyeeList.stream();

        // List<Long> sanFranciscoEmployeeSalaryList =
        employeeStream
                .filter(employee -> "San Francisco".equals(employee.getCity()))
                .map(employee -> employee.getSalary())
                .sorted();
                //.collect(Collectors.toList());

        List<Long> sydneyEmployeeSalaryList = employeeStream
                .filter(employee -> "Sydney".equals(employee.getCity()))
                .map(employee -> employee.getSalary())
                .sorted()
                .collect(Collectors.toList());


        //sanFranciscoEmployeeSalaryList.forEach(System.out::println);

        System.out.println("==============");

        sydneyEmployeeSalaryList.forEach(System.out::println);


    }
}
