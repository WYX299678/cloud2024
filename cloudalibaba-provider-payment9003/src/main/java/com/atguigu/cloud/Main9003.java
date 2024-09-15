package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2024-01-01 15:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9003
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main9003.class,args);
    }
}