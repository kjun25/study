package Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFor {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1, "펭우", 2400),
                new Employee(2, "싱하", 2700),
                new Employee(3, "성조", 3000),
                new Employee(4, "마구", 3200),
                new Employee(5, "조팍", 3400)
        );

        Consumer<Employee> consumer = x -> {
            x.setSalary(x.getSalary() * 2);
        };

        System.out.println("== 연봉 2배 인상 ==");
        doubleSalary(emp, consumer.andThen(System.out::println));
    }

    private static void doubleSalary(List<Employee> emp, Consumer<Employee> f) {
        for (Employee e : emp) {
            f.accept(e);
        }
    }
}

@Data
@AllArgsConstructor
class Employee {
    private int no;
    private String name;
    private double salary;
}
