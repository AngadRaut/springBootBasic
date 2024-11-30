package org.example.using_bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println();
        student.activity();
    }
}
