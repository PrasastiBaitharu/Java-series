package functions;

public class Function_4 {
    //With parameter and with return type

    public static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println(result);
    }
}
