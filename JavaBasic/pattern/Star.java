package pattern;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int x = sc.nextInt();
        // for(int i=1 ; i<=x ; i++){
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=1 ; i<=x ; i++){
            for(int j=x ; j>=i ; j--){
                if(){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
