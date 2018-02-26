package javaapplication23;

    //final cannot inheritance this Class
public final class Circle extends ColorShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    public Circle(double radius) {
//        this("White",radius);
        super("White");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rs = false;
        if(obj != null && obj instanceof Circle) {
            if(radius == ((Circle)obj).getRadius()) {
                rs = true;
            }
        }
        return rs;
    }
    //on ColorShape is final
//    public String getColor() {
//        return "aaaa";
//    }
}
