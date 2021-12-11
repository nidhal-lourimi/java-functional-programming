package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        Integer apply = incrementByOneFunction.apply(1);
        System.out.println(apply);

        int multiply = multipleBy10.apply(2);
        System.out.println(multiply);

        Function<Integer, Integer> addOneThenMultiplyByTen = incrementByOneFunction.andThen(multipleBy10);


        Integer multifunction = addOneThenMultiplyByTen.apply(1);
        System.out.println(multifunction);

        Integer biFunction = addOneThenMultiplyByTenBifunction.apply(2, 20);
        System.out.println(biFunction);

    }

    static Function<Integer,Integer> incrementByOneFunction= number -> number+1;
    static Function<Integer,Integer> multipleBy10 = number -> number*10;


    static BiFunction<Integer,Integer,Integer> addOneThenMultiplyByTenBifunction = (number,mul)-> (number+1)*mul;



    static int increment(int number){
        return number+1;

    }


}
