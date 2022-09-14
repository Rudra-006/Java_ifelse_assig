package if_else_assignment;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        if(marks>80){
            System.out.println("Grade: A");
        }
        else if (60<=marks && marks<=80){
            System.out.println("Grade: B");
        }
        else if (50<=marks && marks<=60){
            System.out.println("Grade: C");
        }
        else if (45<=marks && marks<=50){
            System.out.println("Grade: D");
        }
        else if (25<=marks && marks<=45){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
