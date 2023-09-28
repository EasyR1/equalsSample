package org.example;

import org.example.person.Person;
import software.amazon.awssdk.services.route53domains.model.CountryCode;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = Person.builder()
                .firstName("Livia")
                .lastName("Hildegund")
                .phoneNumber("+49 30 087304821")
                .birthdate(LocalDate.of(1965, 1, 8))
                .countryCode(CountryCode.DE)
                .build();

        Person secondPerson = Person.builder()
                .firstName("Livia")
                .lastName("Hildegund")
                .phoneNumber("+49 30 087304821")
                .birthdate(LocalDate.of(1965, 1, 8))
                .countryCode(CountryCode.DE)
                .build();

        Person thirdPerson = Person.builder()
                .firstName("Ivanov")
                .lastName("Ivan")
                .phoneNumber("+7 980 0417251")
                .birthdate(LocalDate.of(2000, 1, 8))
                .countryCode(CountryCode.RU)
                .build();

        Person anotherLinkOnFirstPerson = firstPerson;

        System.out.println(firstPerson.equals(secondPerson));
        System.out.println(firstPerson == secondPerson);

        System.out.println(firstPerson.equals(thirdPerson));
        System.out.println(firstPerson == thirdPerson);

        System.out.println(anotherLinkOnFirstPerson.equals(firstPerson));
        System.out.println(anotherLinkOnFirstPerson == firstPerson);
    }
}