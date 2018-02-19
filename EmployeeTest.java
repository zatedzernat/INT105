/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21.folder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INT105
 */
public class EmployeeTest {
    public static void main(String[] args) {
        String test_name = "Nontakorn";
        Person emp = new Employee(test_name);
        Staff st = new Staff(test_name);
        System.out.println(st);
        Person std = new Student(test_name,Student.Status.freshman);
        System.out.println(std);
        System.out.println();
        System.out.println(std.getSignature());
        System.out.println("------------------------");
        
        Person [] persons = new Person[5];
        persons[0] = new Employee("bill");
        persons[1] = new Student("hong", Student.Status.junior);
        persons[2] = new Student("korn", Student.Status.sophomore);
        persons[3] = new Staff("tiny", "infra");
        persons[4] = new Employee("john");
//        ((Student)persons[1]).getStatus();
        Student std1 = new Student("AAAAAAAA", Student.Status.freshman);
        Student std2 = new Student("AAAAAAAA", Student.Status.freshman);
        if(std1.equals(std2)) {
            System.out.println("***************true************");
        }
        
        for(Object temp:persons) System.out.println(temp+"\n");
        System.out.println(persons[0] instanceof Employee);
    }
    @Test
    public void setNameToEmployee() {
        String test_name ="IKE";
        Employee emp = new Employee(test_name);
        assertEquals(test_name, emp.getName());
    }
}
