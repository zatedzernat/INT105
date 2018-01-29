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
public class Faculty {
    private String fac_name;
    private String university;

    public Faculty(String fac_name, String university) {
        this.fac_name = fac_name;
        this.university = university;
    }

    public String getFac_name() {
        return fac_name;
    }

    public void setFac_name(String fac_name) {
        this.fac_name = fac_name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Faculty{" + "fac_name=" + fac_name + ", university=" + university + '}';
    }
}
