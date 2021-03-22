package CaseStudy.Models;

public class Customer {
    String name;
    String dateOfBirth;
    String gender;
    int iDCard;
    int phone;
    String email;
    String typeCustomer;
    String address;

    public Customer(){
    }

    public Customer(String name, String dateOfBirth, String gender, int iDCard, int phone, String email, String typeCustomer, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.iDCard = iDCard;
        this.phone = phone;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getiDCard() {
        return iDCard;
    }

    public void setiDCard(int iDCard) {
        this.iDCard = iDCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", iDCard=" + iDCard +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfo(){
        return name +","+ dateOfBirth +","+ gender +","+ iDCard+","+ phone+","+email+","+typeCustomer+","+address;
    }
}
