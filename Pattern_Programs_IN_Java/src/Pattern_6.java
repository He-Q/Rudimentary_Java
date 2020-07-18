import java.util.Scanner;

public class Pattern_6 {

    public static void main(String args[]){
        System.out.print("Enter the Number: ");
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Pattern_6");
        for(int i =0; i <= n; i++){
            for(int j = i; j <= n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
