package collectionFramework.StackList;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<Integer>();
        
        System.out.print("Enter the number of elements to store: ");
        int size = sc.nextInt();

        System.out.print("Enter the number of elements in a stack: ");
        for(int i=0 ; i<size ; i++){
            st.push(sc.nextInt());
        }

        System.out.print("Stored Elements in the stack are: ");
        Iterator <Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //As stack is LIFO so last it wil be the first to pop
    

        System.out.println("Poped elements in the stacks are: ");
        Iterator <Integer> it2 = st.iterator();
        while (it2.hasNext()) {
            System.out.println(st.pop());
        }
        sc.close();
    }
}
