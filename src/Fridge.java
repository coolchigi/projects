public class Fridge {

    double fridgeSize;

     public boolean present;
     String colour;

    public Fridge(double fridgeSize, boolean present, String colour){
        this.fridgeSize = fridgeSize;
        this.present = true;
        this.present = present;
        this.colour = colour;

        }



    public String toString(){
        String type = "Fridge";

        if(present){
            type = type + " with Freezer";
        }else{
            type = type + "";
        }
        return this.fridgeSize + " cu. ft."
                + type + " ("+ this.colour + ")";


}
}

