package org.example.using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InfoAnimal {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Animal animal1 = (Animal) context.getBean("animal1");
        System.out.println();
        System.out.println(animal1);

        Animal animal2 = (Animal) context.getBean("animal2");
        System.out.println(animal2);

        Animal animal3 = (Animal) context.getBean("animal3");
        System.out.println(animal3);

        Animal animal4 = (Animal) context.getBean("animal4");
        System.out.println(animal4);
    }
}
