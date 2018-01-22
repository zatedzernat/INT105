
package warmup02;
// 1. add a variable to keep track of the number of created student
// 2. revise the class for assigning a unique id for new student 
class Student {
    private long id;
    private String name;
    private static int count;

    public Student(String name) {
        this.name = name;
        count++;
        id = count;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    @Override
    public String toString() {
        return "Id:" + id + " name: " + name + " ALL Student = "+count;
    }    
    
    
}
