class Human {
    void displayHuman() {
        System.out.println("I am a human");
    }
}

class Student extends Human {
    void displayStudent() {
        System.out.println("I am a student");
    }
}

class Employee extends Human {
    void displayEmployee() {
        System.out.println("I am an employee");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.displayHuman();
        s1.displayStudent();

        System.out.println();

        Employee e1 = new Employee();
        e1.displayHuman();
        e1.displayEmployee();
    }
}