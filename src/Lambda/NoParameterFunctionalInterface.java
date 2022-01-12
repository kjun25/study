package Lambda;

import java.util.function.Supplier;

public class NoParameterFunctionalInterface {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Runnable is no parameters and no return type");
        };
        r.run();

        Supplier<String> s = () -> {
            return "Supplier has no parameters but has a return type";
        };
        System.out.println(s.get());
    }
}
