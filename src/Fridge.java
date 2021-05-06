public class Fridge {
    private double fridgeSize;
    private String colorF;
    private boolean isPresent;

    public Fridge(double fridgeSize, String colorF,boolean isPresent){
        this.fridgeSize = fridgeSize;
        this.colorF = colorF;
        this.isPresent = isPresent;

    }

    public double getFridgeSize() {
        return fridgeSize;
    }

    public String getColorF() {
        return colorF;
    }

    public String toString(){
        return String.format("%s cubic foot Fridge%s (%s)",getFridgeSize(),isPresentDet(),getColorF());


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

