class Human{
    public void display(){
        System.out.println("I am a human");
    }
}

public class SingleLevel extends Human {
    public static void main(String[] args) {
        SingleLevel s1 = new SingleLevel();
        s1.display();
    }
}
