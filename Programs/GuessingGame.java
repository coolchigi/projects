import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {
        myGuessingGame();
    }
    
    public static void myGuessingGame() {
        System.out.println("Welcome to Chigo's version of the guessing game!");
        Random random = new Random();
        int randomNumber = random.nextInt(50);

        while (true) {
            Scanner userInput = new Scanner(System.in);
                System.out.println("\nEnter a number: ");
                int userNumber = userInput.nextInt();

                if (userNumber < randomNumber) {
                    System.out.printf("%d is less than the number chosen at random",
                            userNumber);
                } else if (userNumber > randomNumber) {
                    System.out.printf("%d is greater than the number chosen at random",
                            userNumber
                    );
                }
                else {
                    System.out.printf("%d is the right number! ", userNumber);
                    break;
                }
        }
    }
}
