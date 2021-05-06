public class Fridge {
    private double fridgeSize;
    private String colorFr;
    private boolean isPresent;

    public Fridge(double fridgeSize, String colorFr,boolean isPresent){
        this.fridgeSize = fridgeSize;
        this.colorFr = colorFr;
        this.isPresent = isPresent;

    }

    public double getFridgeSize() {
        return fridgeSize;
    }

    public String getColorF() {
        return colorF;
    }

    public String toString(){
        return String.format("%s cu. foot Fridge%s (%s)",getFridgeSize(),isPresentDet(),getColorF());


    }

    public String isPresentDet(){
        if(isPresent){
            return " with Freezer";
        }
        else{
            return "";
        }
    }

    
}

