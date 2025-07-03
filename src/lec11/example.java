package lec11;

public class example<T extends Number> {
    private T number;

    example(T n){
        number = n;
    }

    double reciprocal(){ // nghịch đảo
        return 1 / number.doubleValue();
    }

    double fraction(){ // phần thập phân
        return number.doubleValue() - number.intValue();
    }
    boolean testequals(example<?> e) {
        if (number.doubleValue() == e.number.doubleValue())
            return true;
        return false;
    }


    public static void main(String[] args) {
        example<Integer> e = new example<Integer>(5);
        example<Double> c = new example<Double>(10.5);
        System.out.println("cái e có bằng c ko, Tất nhiên là  " + c.testequals(e));


    }
}
