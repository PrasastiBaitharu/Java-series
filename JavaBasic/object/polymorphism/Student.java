class Subject{
    void marks(int a){
        System.out.println(a);
    }
    void marks(int a , int b){
        System.out.println(a + " " + b);
    }
    void marks(int a , int b , int c){
        System.out.println(a+ " " + b+ " " + c);
    }
}

public class Student{
    public static void main(String[] args){
        Subject s1 = new Subject();
        s1.marks(10);
        s1.marks(10, 20);
        s1.marks(10, 20, 30);
    }
}