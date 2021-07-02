import java.util.Random;
import java.util.Scanner;

class DM_Ex4{
    public static void main (String [] argc){

    //add_part
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scanner.next();
    System.out.println("Hello, "+name+"!");

    //dice_part

        Random num = new Random();
        int value1, value2, total;

        value1 = num.nextInt(6) +1;
        value2 = num.nextInt(6) +1;
        total = value1 + value2;

        System.out.println("Die 1:" +value1);
        System.out.println("Die 2:" +value2);
        System.out.println("Total Value:" +total);

        if(total > 7)
        System.out.println("You won");
        else System.out.println("You lost");

    }
}
