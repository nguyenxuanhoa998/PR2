package CodeCombat;

public class negativeNumber {
    public static boolean old35(int n){
        return(n % 3 == 0 ^ n % 5 == 0);// Sử dụng toán tử XOR (^) để đảm bảo chỉ một trong hai điều kiện đúng
        }
    public static boolean more20(int n){
        return (n%20 ==1 || n%20== 2);
    }
    public static int dateFashion(int you ,int date ){
        if(you ==2 || date==2){
            return 0 ;
        }
        else if(you >=8 && date >2 ){
            return 2;
        }else if ( you >2 && date>=8){
            return 2;
        }else if (you >=8 && date <=2 ){
            return 0;
        }else if (you <=8 && date >=8 ){
            return 0;
        }
        return 1;
    }
    public static int teaParty(int tea , int candy ){
        if(tea < 5 || candy <5 ){
            return 0;
        }
        return tea;
    }
    public static void main (String [] args){
        System.out.print(more20(20));
    }


}
