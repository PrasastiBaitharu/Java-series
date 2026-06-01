package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Maximum {
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
        int max = it.next();
        while(it.hasNext()){
            int num = it.next();
            if(num>max){
                max = num;
            }
        }
        System.out.println("Maximum number is : " + max);
        sc.close();
    }
}
