package com.debmeetbanerjee.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// Record
// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor, equals, hashcode, toString are automatically created
// Released in JDK 16
record Person(String name, int age, Address address) {}
record Address(String lineOne, String city) {}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Debmeet";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        return new Person("Devashish", 18, new Address("Taj Mahal","Agra")); // We did not make this constructor, still works!
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // We did not make this constructor, still works!
    }

    @Bean
    public Person person3Parameters(String name, int age, Address adrs) {
        return new Person(name, age, adrs); // Creating a bean using other existing beans
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address); // Creating a bean using other existing beans
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address2QUAL") Address address) {
        return new Person(name, age, address); // Creating a bean using other existing beans
    }

    @Bean(name = "adrs")
    @Primary // will get preference incase this is one of the multiple matching beans in some scenario
    public Address address() {
        return new Address("India Gate","New Delhi");
    }

    @Bean(name = "adrss")
    @Qualifier("address2QUAL")
    public Address address2() {
        return new Address("Gate","Maidan");
    }
}
