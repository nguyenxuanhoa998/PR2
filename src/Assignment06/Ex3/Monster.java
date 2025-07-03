package Assignment06.Ex3;

public  class Monster {
    protected String name ; // để lớp con có thể sử dụng
    public Monster(){
        this.name= "Unknown Monster";// tạm thời chưa biết con quái là ai
    }
    public  Monster(String name ){
        this.name=name;
    }
    public  String attack(){
        return "!^_&^$@+%$* I don't know how to attack!*";
    }

}
