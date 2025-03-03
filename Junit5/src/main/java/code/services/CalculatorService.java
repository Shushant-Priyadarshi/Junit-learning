package code.services;

public class CalculatorService {

    public static int sum(int a, int b ){
        return a+b;
    }

    public static int product(int a, int b ){
        return a*b;
    }

    public static int sumOfNumbers(int... numbers){
        int sum =0;
        for(int n: numbers){
            sum+=n;
        }
        return sum;
    }
}
