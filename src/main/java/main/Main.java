/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import student.Student;

/**
 *
 * @author qa
 */
public class Main {
    
    public static void main(String[] args) {
    
    Student student = new Student();    
    student.info();
    
    student.setFirstName("Petar");
    student.setLastName("Petrović");
    student.setYearOfBirth(1990);
    
    student.getCourse().setName("QA");
    student.getCourse().setNumberOfClasses(60);
    
    student.getComputer().setProcessTact(4.0);
    student.getComputer().setMemory(16.00);
    student.getComputer().setHardDrive(2000);
        
    student.info();
    
    
    
    }
    
}
