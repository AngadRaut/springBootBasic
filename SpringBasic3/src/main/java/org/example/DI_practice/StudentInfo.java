package org.example.Practice;

import org.springframework.stereotype.Component;

@Component
public class StudentInfo implements Student{

    @Override
    public int getStudentCount() {
        return 60;
    }
}
