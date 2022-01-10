package Lambda;

public class Anonymous {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Anonymous Inner Class execute");

        r.run();
        r.run();
    }
}
