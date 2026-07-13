package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(5);
        arr.add(15);
        arr.add(25);

        // Stream<Integer> data = arr.stream();
        // Stream<Integer> mapped = data.map(n -> n*2);
        // mapped.forEach(n -> System.out.println(n));

        arr.stream().map((n) -> n*2).forEach(n -> System.out.println(n));
        sc.close();
    }
}
