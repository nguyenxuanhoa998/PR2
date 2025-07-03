package Assignment01;
public class Activity_4 {
    public static void main(String[] args) {
        /* Declare the variables. */
        double principal;
        double rate;
        double interest;

        /* Do the computations. */
        principal = 17000;
        rate = 0.07;
        interest = principal * rate;
        principal = principal + interest;

        /* Output the results. */
        System.out.print("The interest earned is ");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is ");
        System.out.println(principal);
    } // end of main()
} // end of class Interest

// a) by changing statement at line 16, the programme does work.
//This is because principal is declared as a double at line 12,
// which can hold both integer and decimal values. The value 17000.0 is a double literal, so there is no type mismatch.

// b) by changing statement at line 12, the programme does work.
// this is because Changing principal to an int causes a type mismatch error at line 19.
//principal is an int.
//interest is a double.
//Java does not automatically allow addition of an int and a double, leading to a compilation error.
//How to fix : Modify line 19 as follows:
//java
//Sao chép mã
//principal = (int) (principal + interest);
//This resolves the error, but the decimal part of interest will be truncated, resulting in a loss of precision.
