package Lambda;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionInterface03 f = (int t) -> {
            String result = "";
            for (int i = 0; i < t; i++) {
                result += "만세1\n";
            }
            return result;
        };
        System.out.println("== 만세삼창1==");
        System.out.print(f.apply(3));


        //Function<T, R>
        Function<Integer, String> function = t -> {
            String result = "";
            for (int i = 0; i < t; i++) {
                result += "만세2\n";
            }
            return result;
        };
        System.out.println("== 만세삼창2==");
        System.out.print(function.apply(3));
    }
}

//불필요한 컴파일.. function<T, R> 있는거 쓰자
@FunctionalInterface
interface FunctionInterface03 {
    public String apply(int t);
}
