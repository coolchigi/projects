import java.util.Scanner;

public class ElectronicStoreTester {
    public static void main(String[] args){

        ElectronicStore finalItems = new ElectronicStore("Chigo's Store");
        Scanner user = new Scanner(System.in);


        System.out.println("Welcome to " + finalItems.name + "\n\n" +
                "The store stock includes:");
        finalItems.printStock();

        System.out.println("Enter a term to search for: ");
        String searchItem = user.nextLine();
        finalItems.searchStock(searchItem);

        while(!searchItem.equals("quit") ){ 
            System.out.println("Enter a term to search for: ");
            searchItem = user.nextLine();
            finalItems.searchStock(searchItem);
        }
        user.close(); //Good practice



    }
}
