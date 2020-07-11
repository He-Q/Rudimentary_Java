import java.util.Scanner;

public  class Pattern_2 {
    public static void main(String args[]) {
        System.out.print("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Pattern_2");
        System.out.println("Pattern of j:");
        for(int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*

Enter the Number :5
Pattern_2
Pattern of j:
12345
12345
12345
12345
12345

 */