package Lambda;

import java.util.Arrays;
import java.util.List;

public class ConsumerForEach {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1, "ABC", 2400),
                new Employee(2, "DEF", 2700),
                new Employee(3, "QWE", 3000),
                new Employee(4, "ASD", 3200),
                new Employee(5, "ZXC", 3400)
        );
        emp.forEach(x -> {
            x.setSalary(x.getSalary() * 2);
            System.out.println(x);
        });
    }
}
