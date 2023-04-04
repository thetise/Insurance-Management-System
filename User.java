package Sigorta;

import java.time.LocalDate;
import java.util.*;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private List<Address> addressList = new ArrayList<>();
    private LocalDate lastLoginDate;
    private List<Insurance> insurancesList = new ArrayList<>();


    public User(String name, String surname, String email, String password, String job, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.lastLoginDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public List<Insurance> getInsurancesList() {
        return insurancesList;
    }

    public void setInsurancesList(List<Insurance> insurancesList) {
        this.insurancesList = insurancesList;
    }
}
