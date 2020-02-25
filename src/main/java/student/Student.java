/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author qa
 */
public class Student {
    //Atributi klase Student
    private String firstName;
    private String lastName;
    int yearOfBirth;
    
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public int getyearOfBirth() {
        return this.yearOfBirth;
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
    
    public Student() {
        this.firstName = "Petar";
        this.lastName = "Petrovic";
        this.yearOfBirth = 1990;
    }
    
    public Student(String customFirstName, String customLastName, int customYearOfBirth) {
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;
    }
 
    public void info() {
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getyearOfBirth());
    }
    
 
    
}

