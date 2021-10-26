package hotelreservation.src;

import hotelreservation.src.model.customer.Customer;

public class Tester {
    public static void main(String[] args){
        Customer customer = new Customer("Cris", "Rodriguez", "crgmail.com");
        System.out.println(customer);
    }
    
}
