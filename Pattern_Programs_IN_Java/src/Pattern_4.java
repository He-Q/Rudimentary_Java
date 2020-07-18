import java.util.Scanner;

public class Pattern_4 {

    public static void main(String args[]){
        System.out.print("Enter the Number:");
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Pattern_4");
        System.out.println("Pattern of i:");
        for(int i = 1; i<=n; i++){
            for(int j = i; j <= n ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
Enter the Number:5
Pattern_4
Pattern of i:
11111
2222
333
44
5

* */