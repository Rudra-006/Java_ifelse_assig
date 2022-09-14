package if_else_assignment;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        if(a<0){
            a=a*(-1);
            System.out.println("Absolute value: "+a);
        }
        else{
            System.out.println("Absolut value: "+a);
        }
    }

}
