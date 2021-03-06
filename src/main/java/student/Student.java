/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import course.Course;
import computer.Computer;

/**
 *
 * @author qa
 */
public class Student {
    //Atributi klase Student
    private String firstName;
    private String lastName;
    int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
    public Computer getComputer() {
    return this.computer;
    }
    

    public void setFirstName(String customFirstName) {
        this.firstName = customFirstName;
    }    
    
    public void setLastName(String customLastName) {
        this.lastName = customLastName;
    } 
    
    public void setYearOfBirth(int customYearOfBirth) {
        this.yearOfBirth = customYearOfBirth;
    } 
    
    /*public Student() {
        this.firstName = "Petar";
        this.lastName = "Petrovic";
        this.yearOfBirth = 1990;
    }*/
    
    public Student(String customFirstName, String customLastName, int customYearOfBirth) {
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;
    }
    
    public Student(Course customCourse, Computer customComputer) {
        this.course = customCourse;
        this.computer = customComputer;
    }
    
    public Student(){
        course = new Course();
        computer = new Computer();
    }
    
    public void info() {
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getYearOfBirth());
        System.out.println("Course name: " + course.getName());
        System.out.println("Course number of classes: " + course.getNumberOfClasses());
        System.out.println("Process tact: " + computer.getProcessTact());
        System.out.println("Memory: " + computer.getMemory());
        System.out.println("Hard drive: " + computer.getHardDrive());
    }
    
 
    
}

