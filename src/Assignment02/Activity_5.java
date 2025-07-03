package Assignment02;

public class Activity_5 {
    public static int lowestCommonBit(long a , long b){
        long commonBits = a & b ;
        for (int i= 0 ; i < 64 ; i++){
            if((commonBits &1)==1){

                return i ;
            }
            commonBits >>=1 ;
            }
        return -1;
        }
        public static void main(String[] args){
            System.out.println(lowestCommonBit(14,25));
        }
    }
