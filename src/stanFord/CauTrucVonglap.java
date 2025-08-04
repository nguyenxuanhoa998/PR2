package stanFord;

import java.util.Scanner;

public class CauTrucVonglap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int i =0 ;
        while (i<10){
            i++;
            System.out.println("hôm nay nanwgg đẹp " + i);
        }
        System.out.println();
        for(int j = 80 ; j< 90 ; j +=2){
            System.out.println(j);
        }

        // bài 4 nhập số nguyên dương N tính
        System.out.println("Nhập số nguyên dương vào: ");
        int N= 0;
        int sum = 0;
        double average;
        N = sc.nextInt();

        for (int  k =0 ; k <= N ; k ++){
            sum = sum +k;
        }
        average= (double) sum/N;
        System.out.printf("S = %.2f" , average);*/
        int hangChuc=0;
        int donvi=0;
        int tong =0;
        int tich=0;
        for (int i =10; i<=99; i++){
             hangChuc=i/10;
            donvi=i%10;
            tong = hangChuc+donvi;
            tich=hangChuc*donvi;
            if(tich==2*tong){
                System.out.println(i);
            }
        }
    }
}
