package org.example.using_bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig1 {
    @Bean
    public Student student(){
        return new Student();
    }
}
