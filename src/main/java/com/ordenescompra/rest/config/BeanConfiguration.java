package com.ordenescompra.rest.config;

import com.ordenescompra.rest.serviceImpl.UploadFile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public UploadFile uploadFile(){

        return new UploadFile();

    }


}
