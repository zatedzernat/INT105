package javaapplication9;
import java.util.Scanner;

public class warmup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 num (0-5): ");
        int [] num = new int[10];
        for(int i=0;i<num.length;i++) {
            num[i] = sc.nextInt();
        }
        int [] count = new int [6];
        for(int i=0;i<num.length;i++) {
            count[num[i]]++;
        }
        for(int i =0;i<count.length;i++) {
            System.out.println(i+" : "+count[i]);
        }
    }
    
}
