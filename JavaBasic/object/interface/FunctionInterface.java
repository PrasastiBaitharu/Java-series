package object.Interface;

@FunctionalInterface
interface A{
    void show();
}

public class FunctionInterface {
    public static void main(String[] args) {
        A obj = ()->System.out.println("I am show");
        obj.show();
    }
}
