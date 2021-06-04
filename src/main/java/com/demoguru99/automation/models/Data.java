package com.demoguru99.automation.models;

public class Data {
    private String firstName, lastName, phone, email, address,  city,  state, postalCode, country, userName, password;

    public Data(String firstName, String lastName, String phone, String email, String address, String city, String state, String postalCode, String country, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
