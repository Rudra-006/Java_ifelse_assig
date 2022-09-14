package if_else_assignment;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Salary:");
        float slr= sc.nextFloat();
        System.out.println("Enter years of service:");
        int yr= sc.nextInt();
        if(yr>5){
            slr=slr+(slr*0.05f);
            System.out.println("Your Salary is "+slr+" with bonus included.");
        }
        else{
            System.out.println("Your salary is"+slr);
        }
    }
}

