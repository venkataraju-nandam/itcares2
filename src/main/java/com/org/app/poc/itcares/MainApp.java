package com.org.app.poc.itcares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Venkata.Nandam
 * https://spring.io/guides/gs/rest-service/
 * 
 * Make the application executable
Although it is possible to package this service as a traditional WAR file for deployment 
to an external application server, 
the simpler approach demonstrated below creates a standalone application. 
You package everything in a single, executable JAR file, 
driven by a good old Java main() method. Along the way, 
you use Spring’s support for embedding the Tomcat servlet container as the HTTP runtime, 
instead of deploying to an external instance.
 *
 */
@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
        System.out.println("SpringBoot Main App Started .....");
    }
}
