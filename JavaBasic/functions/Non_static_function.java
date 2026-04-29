package functions;

class MathUtil{
    public int sum(int a, int b){
        return a+b;
    }
}

// class MathUtil{
//     int sum(int a, int b){
//         return a+b;
//     }
// }

public class Non_static_function {
    public static void main(String[]args){
        MathUtil Mu = new MathUtil();
        int a = 10;
        int b = 20;
        int result = Mu.sum(a, b);
        System.out.println(result);
    }
}
