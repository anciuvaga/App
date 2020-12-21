package com.app;

import enums.Sex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

String name;
LocalDate birthday;
Sex gender;
String emailAddress;

    public Person(String name, Sex gender, String emailAddress, String birthday) {
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("d-MMM-yyyy"));
    }

    public int getAge() {
        int today = LocalDate.now().getYear();
        int age = today - getBirthday().getYear();
        return age;
    }

    public void printPerson() {
        System.out.println(Person.this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

