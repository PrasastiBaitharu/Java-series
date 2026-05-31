package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a1 = new ArrayList<Integer>();

        System.out.println("Enter the number of elements: ");
        int pos = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=0 ; i<pos ; i++){
            a1.add(sc.nextInt());
        }
        System.out.println("Stored elements are: ");
        Iterator <Integer> it = a1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        sc.close();
    }
}
