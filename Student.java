package javaapplication21.folder;

public class Student extends Person{
    public static enum Status{freshman,sophomore, junior,senior};
    Status status;

    public Student(String name, Status status) {
        super(name);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "\nstatus=" + status;
    }
    
    @Override
    public String getSignature() {
        return super.getName().substring(0, 2).toUpperCase()+"-"+super.getName().substring(super.getName().length()-2).toUpperCase();
    } 

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj !=null && obj instanceof Student) {
            if(super.getName()==((Student)obj).getName()) {
                result = true;
            }
        }
        return result;
    }
}
