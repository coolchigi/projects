import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner Calculator = new Scanner(System.in);
        String userName;
        double weight;
        double height, BMI;

        System.out.println("What is your name? ");
        userName = Calculator.nextLine();

        System.out.printf("Welcome to your BMI calculator %s", userName +'\n');

        System.out.println("\nWhat is your weight in kilograms? ");
        weight = Calculator.nextDouble();

        System.out.println("What is your height in meters? ");
        height = Calculator.nextDouble();

        BMI = weight / (Math.pow(height,2));

        System.out.printf("Your BMI is %s", BMI);
        System.out.println("\n");
        if (BMI < 18.5) {
            System.out.print("You're underweight, " + userName);
        } else if (BMI < 25){
            System.out.print("You are normal weight, " + userName);
        } else if (BMI < 30) {
            System.out.printf("%s, you have passed the normal weight range"
                    , userName + "!");
        }
        else{
            System.out.print("You are obese " + userName + "!");
        }

    }


}
