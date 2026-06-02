package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a1 = new ArrayList<Integer>();

        System.out.println("Enter the number of elements: ");
        int pos = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=0 ; i<pos ; i++){
            a1.add(sc.nextInt());
        }

        Iterator <Integer> it = a1.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(num%2==0){
                it.remove();
            }
        }
        Iterator <Integer> it2 = a1.iterator();
        System.out.println("Remaining elements are: ");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        sc.close();
        
    }
}
