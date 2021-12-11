package functionalinterface;

import java.util.function.Supplier;

public class _supplier {

    public static void main(String[] args) {
        System.out.println( getUrl());

    }

    static String getUrl(){
        return"https://www.google.com/ ";
    }

    Supplier<String> getUrl= ()-> "https://www.google.com/";
}
