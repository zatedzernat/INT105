
package javaapplication9;

public class TestStudent {
    public static void main(String[] args) {
        Faculty fc = new Faculty("SIT", "Kmutt");
        Address ad = new Address("555", "BKK", "BKK");
        Student std = new Student(60130500055L, "Bew", "bccbew164@gmail.com", ad, fc);
        System.out.println(std);
        System.out.println("");
        System.out.println("--------after set--------");
        ad.setAddress("321");
        ad.setCity("Paris");
        ad.setProvince("Huahin");
        System.out.println(std);
    }
}
