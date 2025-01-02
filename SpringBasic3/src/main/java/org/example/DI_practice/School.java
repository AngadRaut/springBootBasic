package org.example.Practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class School {

    @Autowired
    private StudentInfo studentInfo;

    public School(StudentInfo studentInfo){
        this.studentInfo=studentInfo;
    }

    public void displayStudentInfo(){
        int count = this.studentInfo.getStudentCount();
        System.out.println("count = "+count);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigClass.class);
        School student = (School) context.getBean("school");
        student.displayStudentInfo();
    }
}
