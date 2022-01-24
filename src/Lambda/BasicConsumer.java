package Lambda;

import java.util.function.Consumer;

public class BasicConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> {
            System.out.printf("%s는 1개의 매개변수는 있지만 반환할 자료형은 없습니다.", x.toUpperCase());
        };
        consumer.accept("Consumer");
    }
}
