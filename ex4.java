import java.util.Random;

class DM_Ex4{
    public static void main (String [] argc){

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
