package org.example.using_component_annotation;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public void hobby(){
        System.out.println("Employee likes to play cricket.");
    }
}
