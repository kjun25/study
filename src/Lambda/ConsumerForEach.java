package Lambda;

import java.util.Arrays;
import java.util.List;

public class ConsumerForEach {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1, "펭우", 2400),
                new Employee(2, "싱하", 2700),
                new Employee(3, "성조", 3000),
                new Employee(4, "마구", 3200),
                new Employee(5, "조팍", 3400)
        );
        emp.forEach(x -> {
            x.setSalary(x.getSalary() * 2);
            System.out.println(x);
        });
    }
}
