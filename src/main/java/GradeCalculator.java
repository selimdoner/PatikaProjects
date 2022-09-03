import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int counter=0,total=0;
        System.out.print("Please enter your Math note = ");
        int math=input.nextInt();

        System.out.print("Please enter your Physics note = ");
        int physics=input.nextInt();

        System.out.print("Please enter your Chemistry note = ");
        int chemistry=input.nextInt();

        System.out.print("Please enter your Turkish note = ");
        int turkish=input.nextInt();

        System.out.print("Please enter your Music note = ");
        int music=input.nextInt();

        if ((math >= 0) && (math <= 100)) {
            total += math;
            counter++;
        }
        if ((physics >= 0) && (physics <= 100)) {
            total += physics;
            counter++;
        }
        if ((chemistry >= 0) && (chemistry <= 100)) {
            total += chemistry;
            counter++;
        }
        if ((turkish >= 0) && (turkish <= 100)) {
            total += turkish;
            counter++;
        }
        if ((music >= 0) && (music <= 100)) {
            total += music;
            counter++;
        }
            double average = (total/counter);
            if(average >= 55){
                System.out.println("Your average is: "+ average+" Congratulations you passed ! ");
            }else{
                System.out.println("Your average is: "+ average+" Failed, Better try again ! ");
            }
        }
    }
