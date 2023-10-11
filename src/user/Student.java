package user;

import java.util.Scanner;

public class Student extends User {
    private String subject;
    public Student(){
    }

    public Student(int id, String username, String password, String subject) {
        super(id, username, password);
        this.subject = subject;
    }
    @Override
    public void displayData(){
        super.displayData();
        System.out.println("Môn học : " + this.subject + "\n");
    }
}
