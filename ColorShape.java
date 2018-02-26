package javaapplication23;

    //abstract cannot create Shape object 
public abstract class ColorShape implements Shape, Comparable<Shape>{
    private String color;
    
    public ColorShape(String color) {
        this.color = color;
    }
    //final = cannot override
    public final String getColor() {
        return color;
    }
    //abstract go to child method (child must have this method) 
//    @Override
//    public abstract double getArea();
//    @Override
//    public abstract double getPerimeter();
    //comment because it is in interface
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