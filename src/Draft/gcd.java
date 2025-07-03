package Draft;

public class gcd {
    public static int GCD (int a , int b ){
        int n = Math.min(a,b);
        for (int i =1 ; i <= n ; i++){
            int gcd =i ;
            if (a%i  == 0 && b% i== 0)
                return gcd;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println( GCD( 9, 18) );
    }
}
