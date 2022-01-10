package Lambda;

public class LambdaTest {
    public static void main(String[] args) {

        FunctionInterface01 f = () -> System.out.println("FunctionInterface01 test");

        f.test();

        FunctionInterface02 f2 = (a) -> a;
        System.out.println(f2.test("FunctionInterface02 test"));

        FunctionInterface02 f3 = (a) -> {
            return a;
        };
        System.out.println(f3.test("FunctionInterface02 test"));
    }
}

//단 한 개의 추상 메서드를 갖고 있는 인터페이스
@FunctionalInterface
interface FunctionInterface01 {
    public void test();
}

@FunctionalInterface
interface FunctionInterface02 {
    public String test(String a);
}