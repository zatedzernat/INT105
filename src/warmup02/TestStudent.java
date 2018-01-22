package warmup02;
// 1. declare an array variable consisting of 3 Student objects
// 2. print all students object to the console using "for" and "foreach" style

public class TestStudent {

    public static void main(String[] args) {
        Student [] std = {new Student("hong"), new Student("bew"), new Student("ter")};
        //for each
        for(Student print : std) {
            System.out.println(print.toString());
        }
        System.out.println("");
        //for
        for(int i=0;i<std.length;i++) {
            System.out.println(std[i].toString());
        }
    }

}
