package throwable;

import java.util.Scanner;

public class Throwable {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x=0, y=0;
//        while(x!=-999) {
//            System.out.print("input x and y: ");
//            x = sc.nextInt();
//            y = sc.nextInt();
//            if(x==-999) break;
//            try {
//                System.out.println("X diveid y= "+devideMe(x, y));
//            }catch (ArithmeticException obj) {
//                System.out.println("you can't input y=0");
//                System.out.println("Exception cause: "+obj.getMessage());
//            }
//            System.out.println("------------------------");
//        }
        try{
            exp("INT105");
        }catch(MyException obj) {
            System.out.println("Exception's cause: "+obj.getMessage());
        }finally{
            System.out.println("------------------");
        }
    }
    public static int devideMe(int x, int y) {
        return x/y;
    }
    
    public static void exp(String subject) throws MyException{
        if(subject.equals("INT102")) {
            MyException temp = new MyException("Subject Error");
            throw temp;
        }
        System.out.println("I will get \"A\" for "+subject);
    }
}
