package if_else_assignment;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of classes held: ");
        float a= sc.nextInt();
        System.out.println("Number of classes attended: ");
        float b= sc.nextInt();
        float c= (b/a)*100;
        System.out.println("Attendance Per: "+ c+"%");
        if(c>=75){
            System.out.println("Student is allowed to sit in class.");
        }
        else{
            System.out.println("Student is not allowed.");
        }
    }
}
