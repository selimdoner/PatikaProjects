import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your username : ");
        String username=input.nextLine();
        System.out.println("Please Enter your password : ");
        String password=input.nextLine();

        if (username.equalsIgnoreCase("developer") && password.equals("010101")){
            System.out.println("Welcome..your username and password are valid !");
        }else {
            System.out.println("invalid entry !");
        }
    }
}
