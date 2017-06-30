package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by mohamed on 29/06/17.
 */
@SpringBootApplication
@EnableConfigServer
public class Lab3ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Lab3ServerApplication.class);
    }
}
