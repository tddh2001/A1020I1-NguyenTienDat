package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Pattern(regexp = "^(KH-)[\\d]{4}$", message = "The customer ID has the format KH-XXXX (X : 0-9")
    @NotBlank(message = "Not Blank!")
    @Column(length = 50)
    private String customer_id;
    @NotBlank(message = "Not Blank!")
    private String customer_name;
    @Past(message = "Invalid")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customer_birthday;
    @Pattern(regexp = "^([\\d]{9}|[\\d]{12})$", message = "Invalid")
    @NotBlank(message = "Not blank!")
    private String customer_iDCard;
    @Pattern(regexp = "^((\\(84\\)\\+)|(0))((91)|(90)|(84)|(85)|(93)|(94)|(96)|(38))[\\d]{7}$", message = "Invalid phone number")
    @NotBlank(message = "Not blank!")
    private String customer_phone;
    @Pattern(regexp = "^(.+)@(.+)$", message = "Invalid email")
    @NotBlank(message = "Not blank!")
    private String customer_email;
    @NotBlank(message = "Not blank!")
    private String customer_address;
    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;
    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender customer_gender;

    @OneToMany(mappedBy = "customer")
    private Set<Contract> contracts;

    public Customer() {
    }

    public Customer(CustomerType customerType, String customer_name, Date customer_birthday, String customer_iDCard, String customer_phone, String customer_email, String customer_address) {
        this.customerType = customerType;
        this.customer_name = customer_name;
        this.customer_birthday = customer_birthday;
        this.customer_iDCard = customer_iDCard;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Date getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(Date customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public Gender getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(Gender customer_gender) {
        this.customer_gender = customer_gender;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getCustomer_iDCard() {
        return customer_iDCard;
    }

    public void setCustomer_iDCard(String customer_iDCard) {
        this.customer_iDCard = customer_iDCard;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
