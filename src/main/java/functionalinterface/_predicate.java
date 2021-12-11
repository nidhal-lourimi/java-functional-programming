package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid( "070000000"));

        System.out.println(isPhoneNumberValid( "0700000010"));

        String number="0";
        boolean test = isPhoneNumberValidP.test(( "070000000"));
        System.out.println(test);
        System.out.println( isPhoneNumberContain.test(( "070000000"),number));



    }
    static boolean isPhoneNumberValid(String phoneNumber)
    {
        return phoneNumber.startsWith("07")&& phoneNumber.length()==9;
    };
    static Predicate<String> isPhoneNumberValidP = phoneNumber-> (phoneNumber.startsWith("07")&& phoneNumber.length()==9);

    static BiPredicate<String,CharSequence> isPhoneNumberContain=  (phoneNumber,n)->phoneNumber.contains(n);
}
