package javaapplication23;

public class TestShape {
    public static void main(String[] args) {
        Shape shape01 = new Circle("white", 10);
        Shape circle01 = new Circle("white", 10);
        
        Rectangle shape02 = new Rectangle("white", 20, 10);
        Comparable [] shapes = new Comparable[3];
        shapes[0] = new Circle("white", 10);
        shapes[1] = new Rectangle("white", 20, 10);
        shapes[2] = new Triangle(10, 10, 10);
        
        if(shape01.equals(circle01)) {
            System.out.println("true");
        }
        
        System.out.println("-----------------------------");
        System.out.println(shape01.getArea());
        System.out.println(shape02.getArea());
        System.out.println("-----------------------------");
        //cast type
//        System.out.println(shapes[0].getArea());
//        System.out.println(shapes[1].getArea());
//        System.out.println(shapes[0].getPerimeter());
//        System.out.println(shapes[1].getPerimeter());
        
        if(shapes[0].compareTo(shapes[1])<0) {
            System.out.println("shape0<shape1");
        }else System.out.println("4444444444444");
    } 
}
