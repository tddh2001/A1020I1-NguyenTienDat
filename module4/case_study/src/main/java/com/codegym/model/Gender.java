package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gender_id;
    private String gender;

    @OneToMany(mappedBy = "customer_gender")
    private List<Customer> customerList;

    @OneToMany(mappedBy = "employee_gender")
    private List<Employee> employeeList;

    public Gender() {
    }

    public Gender(String gender, List<Customer> customerList, List<Employee> employeeList) {
        this.gender = gender;
        this.customerList = customerList;
        this.employeeList = employeeList;
    }

    public Gender(int gender_id, String gender, List<Customer> customerList) {
        this.gender_id = gender_id;
        this.gender = gender;
        this.customerList = customerList;
    }

    public int getGender_id() {
        return gender_id;
    }

    public void setGender_id(int gender_id) {
        this.gender_id = gender_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
