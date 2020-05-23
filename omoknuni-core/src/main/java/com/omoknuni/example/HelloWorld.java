package com.omoknuni.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring boot 테스트용으로 Hello World를 표시하는 Class
 *
 * @author funa
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {

    /**
     * Spring boot를 실행한다.
     *
     * @param args java main args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

    /**
     * Home 화면으로 이동하고 Hello World를 표시한다.
     *
     * @return Hello World!
     */
    @RequestMapping("/")
    String goHome() {
        return "Hello World!";
    }

}
