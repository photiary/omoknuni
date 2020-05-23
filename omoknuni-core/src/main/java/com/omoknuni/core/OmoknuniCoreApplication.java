package com.omoknuni.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Omoknuni core의 Spring boot 실행 Class
 *
 * @author funa
 */
@SpringBootApplication
public class OmoknuniCoreApplication {

    /**
     * Spring boot를 실행한다.
     *
     * @param args java main args
     */
    public static void main(String[] args) {
        SpringApplication.run(OmoknuniCoreApplication.class, args);
    }

}
