package if_else_assignment;
import java.util.*;

public class Lvl2_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter sex: ");
        char c= sc.next().charAt(0);

        if(20<=age && age<=60){
            if(c=='F'){
                System.out.println("Eligible for working in urban areas");
            } else if (c=='M') {
                if(20<=age && age<=40){
                    System.out.println("Eligible for working anywhere.");
                } else if (40<=age && age<=60) {
                    System.out.println("Eligible for working in urban areas");
                }
            }
        }
        else{
            System.out.println("ERROR");
        }
    }
}
