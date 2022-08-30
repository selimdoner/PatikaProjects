import java.util.Scanner;

public class CalculateAreaOfCircle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        double r= input.nextDouble();
        System.out.print("Please enter the angle of the circle: ");
        double a=input.nextDouble();
        if(a>0 && a<=360) {
            double area = Math.PI * (r * r * a) / 360;
            System.out.printf("Area of Circle is: %.2f", area);
        }else{
            System.out.println("Please enter the angle value between 0-360 ");
        }
    }
}
