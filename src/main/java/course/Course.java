/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author qa
 */
public class Course {
    //Atributi klase Course
    private String name;
    private int numberOfClasses;
    private String codeName;
    
    
    public String getName() {
        return this.name;
    }
    
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }
    
    public String getCodeName() {
        return this.codeName;
    }

    public void setName(String customName) {
        this.name = customName;
    }    
    
    public void setNumberOfClasses(int customNumberOfClasses) {
        this.numberOfClasses = customNumberOfClasses;
    } 
    
    public void setYearOfBirth(String customCodeName) {
        this.codeName = customCodeName;
    } 
    
    public Course() {
        this.name = "QA";
        this.numberOfClasses = 60;
        this.codeName = "CubesQA-4";
    }
    
    public Course(String customName, int customNumberOfClasses, String customCodeName) {
        this.name = customName;
        this.numberOfClasses = customNumberOfClasses;
        this.codeName = customCodeName;
    }

    
}
