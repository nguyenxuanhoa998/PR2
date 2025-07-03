import java.time.Year;
public class Employee {
    private String name;
    private int employeeId;
    private int YearOfBirth;

    private static final int NAME_LENGTH =50;
    private static final int MIN_EMPLOYEEID = 1;
    private  static final int MIN_YEAR = 1980 ;
    private static final int MAX_YEAR =2006;

    public Employee(String name , int employeeId , int YearOfBirth){

        if(!isValidName(name)){
            throw new IllegalArgumentException("Invalid Name");
        }


        if(!isValidEmployeeId(employeeId)){
            throw new IllegalArgumentException("Invalid ID");
        }
        if(!isValidYearOfBirth(YearOfBirth)){
            throw new IllegalArgumentException("Invalid year of birth");
        }
        this.name= name;
        this.employeeId= employeeId;
        this.YearOfBirth= YearOfBirth;
    }
    public String getName(){
        return name;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public int getYearOfBirth(){
        return YearOfBirth;
    }
    public int getAge(){
       int currentYear =  Year.now().getValue();
       return  currentYear-YearOfBirth;
    }
    public boolean isValidName(String name){
        return name!= null && !name.trim().isEmpty() && name.length()<= NAME_LENGTH;

    }
    public boolean isValidEmployeeId(int employeeId){
        return employeeId>= MIN_EMPLOYEEID ;
    }
    public boolean isValidYearOfBirth(int year){
        return year >= MIN_YEAR && year <=MAX_YEAR;
    }
    public void setName(String name){
        if(!isValidName(name)){
        throw new IllegalArgumentException("Invalid Name");
        }
        this.name= name;
    }
    private void setYearOfBirth(int YearOfBirth){
        if(!isValidYearOfBirth(YearOfBirth)) {
            throw new IllegalArgumentException("Invalid year of birth");
        }
        this.YearOfBirth=YearOfBirth;
    }
    public String toString(){
        return "tên là " + name + " mã số " + employeeId + " năm sinh " + YearOfBirth;
    }
    public static void main(String [] args){

        Employee c = new Employee("Hòa", 23011 , 1980);

        System.out.println(c.isValidYearOfBirth(900000));
    }
    }


