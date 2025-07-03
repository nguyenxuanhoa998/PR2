package Draft;

import java.io.IOException;

public class Employees {
    private String name ;
    private int employeeId;
    private int yearOfBirth ;
    public Employees(String name , int employeeId , int yearOfBirth ){
        this.name= name;
        this.employeeId=employeeId;
        this.yearOfBirth=yearOfBirth;
        validateName();
        validatemployeeID();
        validateyearOfbirth();
    }
    public String getName(){
        return name;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setName(String name ){
        try {
            if (name == null || name.isEmpty() || name.length() >= 50) {
                throw new Exception("tên nên có khoảng 1 đến 50 chữ cái ");
            }
        }catch (Exception e){
                System.out.println("LỖI : " + e.getMessage());
            }

        this.name= name;
    }
    public void setYearOfBirth(int yearOfBirth){
        try{
        if(yearOfBirth <1980 || yearOfBirth>2006) {
            throw new IllegalArgumentException("trẻ quá hoặc già quá");
        }
        }catch (IllegalArgumentException e) {
            System.out.println("lỗi " + e.getMessage());
        }
        this.yearOfBirth= yearOfBirth;
    }

    public boolean validateName(){
        if(name == null || name.isEmpty() || name.length() >50){
             throw new IllegalArgumentException("Your name shouldnt be null or longer than 50 character");
        }else
            return true;
    }
    public boolean validatemployeeID(){
        if(employeeId <=1){
            throw new IllegalArgumentException("employee ID should be greater than 1");
        }else
            return true;
    }
    public boolean validateyearOfbirth(){
        if (yearOfBirth <= 1980 || yearOfBirth >=2006){
            throw new IllegalArgumentException("too old and too young");
        }else
            return true;
    }


    public String toString(){
        return "Name " + name + " ID " + employeeId + " year of birth " + yearOfBirth ;
    }

    public static void main(String[] args) {
        Employees p = new Employees("hoa" , 12 , 1999);
        System.out.println(p);
        p.setYearOfBirth(1999);
        p.setName("");
        System.out.println(p.getYearOfBirth()+p.getName());
    }
}
