package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class User implements Validator{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    @Min(value = 3)
    private String firstName;
    @NotEmpty
    @Min(value = 3)
    private String lastName;

    private long phoneNumber;
    private int age;
    private String email;

    public User() {
    }

    public User(long id, String firstName, String lastName, long phoneNumber, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
            User user = (User) target;
            String firstName = user.getFirstName();
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
        if(firstName.length() > 30 || firstName.length() < 2) {
            errors.rejectValue("firstName","firstName.length");
        }
    }
}
