import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {
        System.out.print("Please enter an Year : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(year+" year is a leap year !");
        else
            System.out.println(year+" year is not a leap year !");
    }
}
