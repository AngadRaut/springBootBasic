package org.example.using_component_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = (Employee) context.getBean("employee");
        System.out.println();
        employee.hobby();
    }
}
