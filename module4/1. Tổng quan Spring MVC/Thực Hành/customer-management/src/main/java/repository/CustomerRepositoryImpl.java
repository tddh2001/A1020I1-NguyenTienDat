package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Nguyen Van A"));
        customerList.add(new Customer(2, "Nguyen Van B"));
        customerList.add(new Customer(3, "Nguyen Van C"));
    }
    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}
