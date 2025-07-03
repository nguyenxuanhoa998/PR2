package CodeCombat;

public class speeding {
    public  static int caughtSpeeding(int speed , boolean isBirthday){
        if (isBirthday){
            speed = speed -5;
        }
        if( speed <=60){
            return 0;
        }
        else if(61 < speed  && speed <81){
            return 1;

        }if ( speed >= 81 ){
            return 2;
        }
        return 0;

    }
    public static void main (String [] args){
        System.out.println(caughtSpeeding(65, true));    }
}
