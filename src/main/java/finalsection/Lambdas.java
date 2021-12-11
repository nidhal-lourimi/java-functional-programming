package finalsection;

import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Consumer<String> printName = System.out::println;
    }
}
