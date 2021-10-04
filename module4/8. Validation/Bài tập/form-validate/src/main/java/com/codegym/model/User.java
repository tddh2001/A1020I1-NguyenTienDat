package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 5, max = 45, message = "Tên phải có độ dài từ 5 tới 45 ký tự")
    private String firstName;

    @Size(min = 5, max = 45, message = "Tên phải có độ dài từ 5 tới 45 ký tự")
    private String lastName;

    @Min(value = 18, message = "Tuổi phải lớn hơn hoặc bằng 18")
    private int age;

    @Pattern(regexp = "(\\+84|0[3|5|7|8|9])+([0-9]{8})", message = "số điện thoại bắt đầu bằng +84 hoặc 0 và chiều dài 10 ký tự.")
    private String phone;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "email chưa đúng định dạng.")
    private String email;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
