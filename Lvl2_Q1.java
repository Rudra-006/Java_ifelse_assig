package if_else_assignment;
import java.util.Scanner;

public class Lvl2_Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year: ");
        int a= sc.nextInt();
        if((a%100==0 || (a%4==0 && a%100 !=0))){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not Leap year");
        }
    }
}
