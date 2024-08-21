package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Repository;


@SpringBootApplication
@EnableDiscoveryClient

public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);

    }
}
