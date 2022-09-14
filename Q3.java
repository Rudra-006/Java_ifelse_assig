package if_else_assignment;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        float cost;
        System.out.println("Enter the Quantity:");
        Scanner sc= new Scanner(System.in);
        float x= sc.nextFloat();
        x=x*100;
        if(x>1000){
            cost=x-(x*0.1f);
            System.out.println("Total cost is "+cost);
        }
        else{
            System.out.println("Total cost is"+x);
        }
    }
}
