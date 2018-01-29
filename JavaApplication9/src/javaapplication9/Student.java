/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author INT105
 */
public class Student {
    private long id;
    private String name;
    private String email;
    private  Address adress;
    private Faculty falculty;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public Faculty getFalculty() {
        return falculty;
    }

    public void setFalculty(Faculty falculty) {
        this.falculty = falculty;
    }

    public Student(long id, String name, String email, Address adress, Faculty falculty) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.falculty = falculty;
    }

    @Override
    public String toString() {
        return "Student{" + "id: " + id + "\nname: " + name + "\nemail: " + email + "\nadress: " + adress + "\nfalculty: " + falculty + '}';
    }
    
    
}
