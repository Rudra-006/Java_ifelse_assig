package if_else_assignment;

import java.util.Scanner;

public class Lvl2_Q3 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter any number.");
        int var2 = var1.nextInt();

        int var3;
        int var4;
        for(var4 = 0; var2 != 0; var4 = var4 * 10 + var3) {
            var3 = var2 % 10;
            var2 /= 10;
        }

        System.out.println("Reverse of the number is " + var4);
    }
}
