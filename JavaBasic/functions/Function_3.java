package functions;

public class Function_3 {
    //Without parameter and with return type
    public static int sum(){
        int a = 10;
        int b = 20;
        int s = a+b;
        return s;
    }
    public static void main(String[]args){
        int result = sum();
        System.out.println(result);
    }
}
