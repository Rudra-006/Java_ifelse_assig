package if_else_assignment;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the ages:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is oldest");
        }
        else if(b>a && b>c){
            System.out.println("B is oldest");
        }
        else if(c>a && c>b){
            System.out.println("C is oldest");
        }
        else{
            System.out.println("Everyone is same age!!");
        }
    }

}
