package validation;

import validation.CustomerRegistrationValidator.ValidationResult;

import java.time.LocalDate;


import static validation.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer =new Customer(
                 "Alice",
                 "alicegmail.com",
                "0898787879878",
                LocalDate.of(  2000, 1, 1)
) ;
        ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isCustomerAdult()).apply(customer);
        System.out.println(result);

        if(result!=ValidationResult.SUCCESS)    {
            throw new IllegalStateException(result.name());
        }
    }






}
