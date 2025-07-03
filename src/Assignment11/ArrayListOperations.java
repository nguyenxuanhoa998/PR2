package Assignment11;

import utils.NotPossibleException;

import java.util.ArrayList;

public class ArrayListOperations {
    ArrayList<Object> list = new ArrayList<>();
    public void  addInteger(int inte){
        list.add(inte);
    }
    public void addDouble(double D){
        list.add(D);
    }

    public void addBoolean(boolean value){
        list.add(value);
    }
    public void addString(String ten ) {
        if( ten!= null && !ten.trim().isEmpty() ){
            list.add(ten);
        }else{
            throw new NotPossibleException("Invalid string");
        }
    }
    public String toString(){
        return list.toString();
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(list.get(0) + " ");
//        sb.append(list.get(1)+ " ");
//        sb.append(list.get(2)+ " ");
//        sb.append(list.get(3) + " ");
//        return sb.toString().trim();

    }
    public static void main(String[] args) {
        ArrayListOperations arrOps = new ArrayListOperations();
            arrOps.addInteger(3);
            arrOps.addDouble(3.14);
            arrOps.addBoolean(false);
            arrOps.addString("huy");
            System.out.println(arrOps);
    }
//
//        try {
//            ArrayListOperations arrOps = new ArrayListOperations();
//            arrOps.addInteger(3);
//            arrOps.addDouble(3.14);
//            arrOps.addBoolean(false);
//            arrOps.addString("huy");
//            System.out.println(arrOps);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
