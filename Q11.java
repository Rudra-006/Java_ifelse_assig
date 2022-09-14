package if_else_assignment;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter any character");
        char var2 = var1.next().charAt(0);
        if (Character.isLetter(var2)) {
            if (Character.isUpperCase(var2)) {
                System.out.println("Character is UpperCase");
            } else {
                System.out.println("Character is LowerCase");
            }
        }

    }
}
