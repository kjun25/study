package Lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Function;

public class ApplyFunction {
    public static void main(String[] args) {
        Function<Integer, String> f = i -> {
            String returnStr = "";

            for(AlphaNum a : AlphaNum.values()){
                if(i == a.getNum()){
                    returnStr = a.toString();
                    break;
                }
            }
            return returnStr;
        };

        System.out.println(f.apply(5));
    }
}

@Getter
@AllArgsConstructor
enum AlphaNum{
    one(1), two(2), three(3), four(4), five(5);
    private final int num;
}
