/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author qa
 */
public class Computer {
    //Atributi klase Computer
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public double getProcessTact() {
        return this.processTact;
    }
   
    public double getMemory() {
        return this.memory;
    }
     
    public int getHardDrive() {
        return this.hardDrive;
    }
      
     

    public void setOperatingSystem(String customOperatingSystem) {
    this.operatingSystem = customOperatingSystem;
    }
    
    public void setProcessTact(double customProcessTact) {
    this.processTact = customProcessTact;
    }
    
    public void setMemory(double customMemory) {
    this.memory = customMemory;
    }
    
    public void setHardDrive(int customHardDrive) {
    this.hardDrive = customHardDrive;
        
    }    
    
    public Computer() {
        this.operatingSystem = "Linux";
        this.processTact = 2.4;
        this.memory = 16.0;
        this.hardDrive = 500;
    }
    
    public Computer(String customOperatingSystem, double customProcessTact, double customMemory, int customHardDrive) {
        this.operatingSystem = customOperatingSystem;
        this.processTact = customProcessTact;
        this.memory = customMemory;
        this.hardDrive = customHardDrive;
    }
    

    
}
