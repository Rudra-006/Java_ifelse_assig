package if_else_assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Q1. is the rectangle a square
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>0 || b>0) {
            if (a == b) {
                System.out.println("Square!");
            } else {
                System.out.println("Rectangle");
            }
        }
        else{
                System.out.println("Entered dimensions are not valid!! ");
        }

    }
}