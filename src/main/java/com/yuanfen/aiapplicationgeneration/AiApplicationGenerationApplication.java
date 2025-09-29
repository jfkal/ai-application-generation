package com.yuanfen.aiapplicationgeneration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuanfen.aiapplicationgeneration.mapper")
public class AiApplicationGenerationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiApplicationGenerationApplication.class, args);
    }

}
