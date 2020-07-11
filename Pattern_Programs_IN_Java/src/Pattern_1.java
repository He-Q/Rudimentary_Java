import java.util.Scanner;

public  class Pattern_1 {
    public static void main(String args[]) {
        System.out.print("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Pattern_1");
        System.out.println("Pattern of i:");
        for(int i = 1; i <=n;i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*

Enter the Number :5
Pattern_1
Pattern of i:
11111
22222
33333
44444
55555

Process finished with exit code 0


 */