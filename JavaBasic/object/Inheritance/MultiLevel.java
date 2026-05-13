class Human{
    void displayHuman(){
        System.out.println("I am a human");
        
    }
}

class Eating extends Human{
    void displayEating(){
        System.out.println("Human is eating");
    }
}

class Working extends Eating{
    void displayWorking(){
        System.out.println("Human is working");
    }
}

public class MultiLevel extends Working{
    public static void main(String[] args) {
        MultiLevel m1 = new MultiLevel();
        m1.displayHuman();
        m1.displayEating();
        m1.displayWorking();
    }
}
