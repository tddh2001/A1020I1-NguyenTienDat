package CaseStudy.Common;

import CaseStudy.Models.Customer;

import java.util.Comparator;
import java.util.Date;

public class CompareByNameAndDate implements Comparator<Customer> {

    @Override
    public int compare(Customer customer1, Customer customer2) {
        Date date1 = new Date(customer1.getDateOfBirth());
        Date date2 = new Date(customer2.getDateOfBirth());
        if (customer1.getName().compareTo(customer2.getName()) == 0) {
            return (date1.compareTo(date2));
        } else {
            return customer1.getName().compareTo(customer2.getName());
        }
    }
}
