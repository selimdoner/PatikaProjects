import java.util.Scanner;

public class FruitsAndVegetables {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("How many kilos of pears do you need    :");
        double pear=input.nextDouble();
        double pearP=2.14;
        System.out.print("How many kilos of apples do you need   :");
        double apple=input.nextDouble();
        double appleP=3.67;
        System.out.print("How many kilos of tomatoes do you need :");
        double tomatoes=input.nextDouble();
        double tomatoesP=1.11;
        System.out.print("How many kilos of bananas do you need  :");
        double banana=input.nextDouble();
        double bananaP=0.95;
        System.out.print("How many kilos of eggplants do you need:");
        double eggplant=input.nextDouble();
        double eggplantP=5.00;
        double total=(pear*pearP)+(apple*appleP)+(tomatoes*tomatoesP)+(banana*bananaP)+(eggplant*eggplantP);
        System.out.printf("Total amount to pay: %.2f TL",total );
    }
}
