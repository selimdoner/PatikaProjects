import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        double taxRate = 0.18 , taxRate2 = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the sales amount : ");
        int amount= input.nextInt();

        double totalTax = (amount > 1000) ? (amount * taxRate) : (amount * taxRate2);

        System.out.printf("Total amount : %21s",  amount);
        System.out.printf("\nTotal tax : %24s" , (totalTax));
        System.out.printf("\nTotal amount with tax : %12s",(amount+totalTax));
    }
}
