import java.util.Scanner;

public class ReversePyramidStar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter size of the Pyramid");
        int number=input.nextInt();

        for (int i = number; i>=0 ; i--) {
            for (int j = i; j <number ; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
