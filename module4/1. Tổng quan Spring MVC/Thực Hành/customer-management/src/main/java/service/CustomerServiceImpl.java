package service;

import model.Customer;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
