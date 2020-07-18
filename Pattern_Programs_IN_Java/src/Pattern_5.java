import java.util.Scanner;

public class Pattern_5 {

    public static void main(String args[]){
        System.out.print("Enter the Number:");
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Pattern_5");
        System.out.println("Pattern of j:");
        for(int i = 1; i<=n; i++){
            for(int j = i; j <= n ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
Enter the Number:5
Pattern_5
Pattern of j:
12345
2345
345
45
5

* */
