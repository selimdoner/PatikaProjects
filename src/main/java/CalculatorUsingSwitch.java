import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter first number: ");
        double num1=input.nextDouble();
        System.out.print("Please Enter second number: ");
        double num2=input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        double output = 0;
        switch(operator) {
            case '+': output = num1 + num2;
                break;
            case '-': output = num1 - num2;
                break;
            case '*': output = num1 * num2;
                break;
            case '/': if(num2!=0){ output = num1 / num2;
                } else{System.out.println("Divided by zero operation can not possible");
                }
                break;
            default: System.out.println("Error! operator is not correct");
                return;
        }
        System.out.println(num1 +" "+ operator +" "+ num2 +" = "+ output);

    }
}
