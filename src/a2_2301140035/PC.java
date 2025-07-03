package a2_2301140035;
import utils.NotPossibleException;
public class PC {
    private String model;
    private int year;
    private String manufacturer;
    private Set<String> comps;
    private static final int MODEL_LENGTH = 25;
    private static final int MIN_YEAR = 1984;
    private static final int MANUFACTURER_LENGTH = 15;
    public PC (String model , int year , String manufacturer, Set<String> comps){
        if(!isValidModel(model)){
            throw new NotPossibleException("Model format error");
        }
        if(!isValidYear(year)){
            throw new NotPossibleException("Year format error");
        }
        if(!isValidManufacturer(manufacturer)){
            throw new NotPossibleException("Manufacturer format error");
        }
        if(!isValidComps(comps)){
            throw new NotPossibleException("Components format error");
        }
        this.model=model;
        this.year=year;
        this.manufacturer=manufacturer;
        this.comps= comps;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public Set<String> getComps(){
        return comps;
    }
    public boolean isValidModel(String model){
       return model !=null && !model.isEmpty() && model.length() <= MODEL_LENGTH;
    }
    // kiểm tra xem năm bao nhiêu
    public boolean isValidYear(int year){
        return year >= MIN_YEAR ;
    }
    public boolean isValidManufacturer(String manufacturer){
        return manufacturer != null && !manufacturer.isEmpty() && manufacturer.length() <= MANUFACTURER_LENGTH;
    }
    public boolean isValidComps(Set<String> comps){
        return comps !=null;
    }
    public void setModel(String model){
        if (!isValidModel(model)) {
            throw new IllegalArgumentException("Invalid model");
        }
        this.model = model;
    }
    public void setComps(Set<String> comps){
        if (!isValidComps(comps)) {
            throw new IllegalArgumentException("Invalid comps");
        }
        this.comps = comps;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PC)) {
            return false;
        }
            PC pc = (PC) o;
            return getYear() == pc.getYear() && getModel().equals(pc.getModel())
                    && getManufacturer().equals(pc.getManufacturer())
                    && getComps().equals(pc.getComps());

    }
    public String toString(){
        return "PC<" + this.model + ", " + this.year + ", " + this.manufacturer + ", " + this.comps.toString() + ">";    }
}

