
package javaapplication9;

public class TestStudent {
    public static void main(String[] args) {
        Faculty fc = new Faculty("SIT", "Kmutt");
        Address ad = new Address("555", "BKK", "BKK");
        Address ad1;
        Student std = new Student(60130500055L, "Bew", "bccbew164@gmail.com", ad, fc);
        System.out.println(std);
        System.out.println("");
        System.out.println("--------after set--------");
        ad.setAddress("KUY");
        ad.setCity("RAI");
        ad.setProvince("SUS");
        System.out.println(std);
        System.out.println("");
        System.out.println("--------after set--------");
        ad1 = std.getAdress();
        ad1.setAddress("BCC");
        ad1.setCity("BOM");
        ad1.setProvince("BEw");
        System.out.println(std);
    }
}
