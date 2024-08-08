import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {
    public static void main(String[] args) {
        class Employee{
            private String name;
            private int age;
            private double salary;

            public Employee(String name,int age,double salary){
               this.name=name;
               this.age=age;
               this.salary=salary;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }
        }
               List<Employee> employees = Arrays.asList(
                new Employee("John", 45, 50000),
                new Employee("Jane", 35, 60000),
                new Employee("Adam", 25, 45000),
                new Employee("Eve", 55, 70000),
                new Employee("Mike", 40, 55000)
        );

        List<String> result = employees.stream()
                .filter(e -> e.getAge() >= 30 && e.getAge() <= 50)
                .map(e -> "Name: " + e.getName() + ", Salary: " + e.getSalary())
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
