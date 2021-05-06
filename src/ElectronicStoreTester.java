import java.util.Scanner;

public class ElectronicStoreTester {
    public static void main(String[] args){
        ElectronicStore aModel = new ElectronicStore("Chigo's");
        System.out.printf("Welcome to %s store\n", aModel);
        aModel.printStock();

        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a term to search for:");
            String searchItem = input.nextLine();
            searchItem = searchItem.toLowerCase();
            if(aModel.searchStock(searchItem)){
                System.out.println("A matching item is contained in the store's stock.");
            }else if(searchItem.equals("quit")){
                System.out.println("Thank you!");
                break;
            }
            else{
                System.out.println("No items in the store's stock match that term.");
            }
        }
    }

  
}
