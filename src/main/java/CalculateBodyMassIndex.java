import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Please enter your height in m: ");
        double height = input.nextDouble();
        double bmi=weight/(height*height);
        System.out.printf("Your BMI is: %.2f ",bmi);

    }
}
