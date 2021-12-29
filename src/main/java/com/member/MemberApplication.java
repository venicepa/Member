package com.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;
import java.util.Locale;
import java.util.TimeZone;

@ConfigurationPropertiesScan("com.member.config")
@SpringBootApplication
public class MemberApplication {

    @PostConstruct
    public void init() {
        // Setting Spring Boot SetTimeZone
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        // Setting Spring Boot language
        Locale.setDefault(Locale.US);
    }

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

}
