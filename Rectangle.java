package javaapplication23;

public class Rectangle extends ColorShape {
    private double width;
    private double high;

    public Rectangle(double width, double high) {
//        this("White",width,high);
        super("White");
        this.width = width;
        this.high = high;
    }
    
    public Rectangle(String color , double width , double high) {
        super(color);
        this.width = width;
        this.high = high;
    }
    
    @Override
    public double getArea() {
        return this.high * this.width;
    }

    @Override
    public double getPerimeter() {
       return 2 * (this.high + this.width);
    }
    @Override
    public boolean equals(Object o) {
        boolean rs = false;
        if(o != null && o instanceof Rectangle) {
            rs = (width == ((Rectangle)o).width && high == ((Rectangle)o).high);
//            if(width == ((Rectangle)o).width && high == ((Rectangle)o).high){
//                rs = true;
//            }
        }
        return rs;
    }
}
