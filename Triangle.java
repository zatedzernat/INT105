package javaapplication23;

public class Triangle implements Shape, Comparable<Shape>{
    private double line1,line2,line3;

    public Triangle(double line1, double line2, double line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return line1+line2+line3; 
    }

    public int compareTo(Shape she02) {
        int result=0;
        if(getArea()<she02.getArea()) {
            result = -1;
        }else if(getArea()==she02.getArea()) {
            result = 0;
        }else result=1;
        
        return result;
    }
    
}
