import java.util.*;

public class GuessingGame {

    public static void main(String[] args){
        System.out.println("Welcome to Chigo's version of the guessing game!");
        Random random = new Random();
        int randomNumber = random.nextInt(50);

        while(true){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int userNumber = userInput.nextInt();
            if(userNumber < randomNumber){
                System.out.println("Your guess is less than the number chosen at random");
            }else if(userNumber > randomNumber){
                System.out.println("Your guess is greater than the number chosen at random");
            }else{
                System.out.println("You chose the right number");
                break;
            }
        }

    }
}
