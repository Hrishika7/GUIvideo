/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guivideo;

/**
 *
 * @author HP
 */
import java.io.*;

public class Employee implements Serializable{
    
    private String name;
    private String surname;
    private Job job;
    private int StaffNum;

    public Employee(String name, String surname, Job job, int StaffNum) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.StaffNum = StaffNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNum() {
        return StaffNum;
    }

    public void setStaffNum(int StaffNum) {
        this.StaffNum = StaffNum;
    }
    
    
}
