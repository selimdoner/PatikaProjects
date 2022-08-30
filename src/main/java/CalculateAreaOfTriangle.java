import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the 1st side: ");
        int a= input.nextInt();

        System.out.print("Please enter the 2nd side: ");
        int b= input.nextInt();

        System.out.print("Please enter the 3rd side: ");
        int c= input.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.printf("Area of Triangle is= %.2f ", areaOfTriangle(a,b,c));
        } else{
            System.out.println("Area of Triangle not exit");
        }
    }
    public static double areaOfTriangle(int a,int b, int c){
        int s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
