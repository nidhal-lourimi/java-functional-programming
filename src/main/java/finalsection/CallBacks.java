package finalsection;

import java.util.function.Consumer;
import java.util.function.Function;

public class CallBacks {

    public static void main(String[] args) {

      hello("habib","bob" ,value-> "no last name for "+ value );
    }

    static void hello (String name, String lastname, Function<String,String> callBack) {

        if ((lastname != null)) {
            System.out.println(name + " " + lastname);
        } else {
            System.out.println(callBack.apply(name));
        }


    }


}
