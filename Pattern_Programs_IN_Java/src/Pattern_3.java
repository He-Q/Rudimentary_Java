import java.util.Scanner;

public class Pattern_3 {

    public static void main(String args[]){

        System.out.print("Enter the NUmber: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Pattern_3");
        for(int i = 1;i <= n; i++){
            for(int j = 1; j<= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

/*
Enter the NUmber: 5
Pattern_3
*****
*****
*****
*****
*****

*/
