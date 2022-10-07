import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("Hello. What is your name? ");
       String name = input.nextLine();
       Bot2 hal = new Bot2(name);
       hal.greeting();
       System.out.println("What is your favorite animal?");
       String yourAnimal = input.nextLine();
       System.out.println();
       hal.favoriteAnimal(yourAnimal);
       System.out.println("Where do you live?");
       String location = input.nextLine();
       hal.home(location);
       System.out.println("What is your favorite number?");
       int favoriteNumber = input.nextInt();
       hal.favoriteNumber(favoriteNumber);
       hal.goodbye();
        
    }
}