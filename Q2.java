package if_else_assignment;
import java.util.Scanner;

public class Q2 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(a>b){
                System.out.println("A is greater");
            }
            else if(b>a){
                System.out.println("B is Greater");
            }
            else{
                System.out.println("Both are equal!!");
            }

        }
        }
