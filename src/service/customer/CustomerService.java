package src.service.customer;
import src.model.customer.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Cristian Rodriguez
 *
 */

public class CustomerService {
    private static final CustomerService single = new CustomerService();

    private final Map<String, Customer> customers = new HashMap<>();

    private CustomerService(){}

    public static CustomerService getSingle(){
        return single;
    }

    public void addCustomer(final String firstName, final String lastName, String email) {
        customers.put(email, new Customer(firstName, lastName, email));
    }

    public Customer getCustomer(final String customerEmail){
        return customers.get(customerEmail);
    }

    public Collection<Customer> getAllCustomers(){
        return customers.values();
    }
}
