/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

/**
 *
 * @author Hafifah
 */
public class person {
    //variable
    String name;
    int age;
    //constructor
    public person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    //get
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    //set
    public void setAge(int age) {
        this.age=age;
    }
}
