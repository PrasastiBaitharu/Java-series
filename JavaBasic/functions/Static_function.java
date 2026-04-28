package functions;

class MathUtil{
    public static int sum(int a , int b){
        return a+b;
    }
}

public class Static_function {
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        int result = MathUtil.sum(a, b);
        System.out.println("Sum of " + a + " and " + b + " is " + result);
    }
}
