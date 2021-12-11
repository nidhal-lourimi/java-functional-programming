package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("maria", "99999989");
        greetCustomer(maria);
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria,false);


    }
   static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("hello "+customer.name+" thank you for registering you phone"+customer.phoneNumber);

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 =(customer, showPhoneNumber) ->{
        System.out.println("Hello "+customer.name +" thank you for registering your phone number "+(showPhoneNumber?customer.phoneNumber:"******" ));
    };

    static void  greetCustomer (Customer customer){
        System.out.println("hello"+customer.name+"thank you for registering you phone"+customer.phoneNumber);
    };

    record Customer(String name, String phoneNumber) {
    }
}
