package Lambda;

import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

public class SupplierFunction {
    public static void main(String[] args) {
        MessageCenter mc = new MessageCenter("Hello~ Lambda!");
        Supplier<MessageCenter> param = () -> mc;
        MessageCenter main = getMsg(param);
        System.out.println(main);
    }

    public static MessageCenter getMsg(Supplier<MessageCenter> mc){
        return mc.get();
    }
}

//Lombok final 멤버 필드를 매개변수로 하는 생성자를 만들 경우 추가
@RequiredArgsConstructor
class MessageCenter {
    private final String msg;

    @Override
    public String toString() {
        return msg;
    }
}