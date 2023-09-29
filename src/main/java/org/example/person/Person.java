package org.example.person;

import software.amazon.awssdk.services.route53domains.model.CountryCode;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthdate;
    private String phoneNumber;
    private String address;
    private CountryCode countryCode;

    private Person(PersonBuilder builder) {
        firstName = builder.firstName;
        middleName = builder.middleName;
        lastName = builder.lastName;
        birthdate = builder.birthdate;
        phoneNumber = builder.phoneNumber;
        address = builder.address;
        countryCode = builder.countryCode;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: 29.09.2023 Сравнить по ссылке 

        // TODO: 29.09.2023 Сравнить типы данных

        // TODO: 29.09.2023 Сравнить значения полей 

        // TODO: 29.09.2023 Вернуть истину или ложь (true/false)
        return false;
    }

    @Override
    public int hashCode() {
        // TODO: 29.09.2023 CODE:
        return 1;
    }

    @Override
    public String toString() {
        // TODO: 29.09.2023 CODE:
        return "";
    }

    public static class PersonBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private LocalDate birthdate;
        private String phoneNumber;
        private String address;
        private CountryCode countryCode;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder birthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder countryCode(CountryCode countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
