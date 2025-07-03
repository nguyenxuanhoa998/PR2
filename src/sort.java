public class sort {
    public static void selection( int [] a){
        int n =a.length;
        for(int i = 0 ; i < n-1 ; i ++){
            int minIndex =i;
            for(int j= i + 1 ; j <  n ; j ++){
                if (a[j] <  a [minIndex]){
                    minIndex =j;
                    int temp = a[i];
                    a[i] = a[minIndex];
                    a[minIndex] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int [] a = { 2, -1 ,-10, 9, 4 };
        selection(a);
    }
}
