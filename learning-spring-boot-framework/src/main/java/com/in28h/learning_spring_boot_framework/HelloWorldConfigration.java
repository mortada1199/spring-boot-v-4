package com.in28h.learning_spring_boot_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Perspon (String name,int age){
};
record Address(String Line,String Addres1)
{};

@Configuration
public class HelloWorldConfigration {

@Bean
    public String name(){
    return "murtada";
}
@Bean
    public int age(){
    return 20;
}
@Bean
    public Perspon perspon(){
    var person = new Perspon("ali",30);
    return person;
}

    @Bean
    public Perspon perspon2(){
        return new Perspon(name(),age());
    }

    @Bean
    public Address address(){
        var address = new Address("ali","sudan");
        return address;
    }
}
