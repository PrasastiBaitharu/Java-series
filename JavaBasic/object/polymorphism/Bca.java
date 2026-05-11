class Demo{
    void display(){
        System.out.println("Hello world");
    }
}
public class Bca extends Demo{
    void display(){
        System.out.println("Hello iam prasasti");
    }
    public static void main(String[] args) {
        Bca b = new Bca();
        b.display();
    }
}
