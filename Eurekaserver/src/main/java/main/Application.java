package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by mohamed on 30/06/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application{

//    @Value("${eureka.client.serviceUrl.defaultZone}")
//    private String v;
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

//    @Override
//    public void run(String... strings) throws Exception {
//        System.out.println(v);
//    }
}
