/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author Hafifah
 */
public class person {
    String fName;
    String iName;
    String stuId;
    String stuStatus;
    
    public person(String fName, String iName, String stuId, String stuStatus) {
    this.fName=fName;
    this.iName=iName;
    this.stuId=stuId;
    this.stuStatus=stuStatus;
    
}

    public static void main(String[] args) {
        person student=new person("M ","Hasan","123456789","Active");
        System.out.println("Student Name: " +student.fName+" "+student.iName);
        System.out.println("Student ID: " +student.stuId);
        System.out.println("Student Status: " +student.stuStatus);
    }
    
}
