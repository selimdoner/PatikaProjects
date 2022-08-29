import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double counter=0;
        System.out.print("Please enter your Math note = ");
        int math=input.nextInt();
        counter++;

        System.out.print("Please enter your Physics note = ");
        int physics=input.nextInt();
        counter++;

        System.out.print("Please enter your Chemistry note = ");
        int chemistry=input.nextInt();
        counter++;

        System.out.print("Please enter your Turkish note = ");
        int turkish=input.nextInt();
        counter++;

        System.out.print("Please enter your History note = ");
        int history=input.nextInt();
        counter++;

        System.out.print("Please enter your Music note = ");
        int music=input.nextInt();
        counter++;

        double average=(math+physics+chemistry+turkish+history+music)/counter;
        System.out.printf("Your average is %.2f ",average);
        System.out.print(average>=70 ? " You passed":" Better try again");
    }
}
