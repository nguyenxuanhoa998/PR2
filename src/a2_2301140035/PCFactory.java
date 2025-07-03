package a2_2301140035;
import utils.NotPossibleException;
public class PCFactory {
    private static PCFactory instance;

    private PCFactory() {
        // Constructor this is emptty to deal with
    }

    public static PCFactory getInstance() {
        if (instance == null) {
            instance = new PCFactory();
        }

        //Return intance
        return instance;
    }

        // return the created PC to build up the PC
    public PC createPC (String model , int year , String  manufacturer, Set<String> compSet) throws NotPossibleException {
        return new PC(model, year, manufacturer, compSet);
    }
}