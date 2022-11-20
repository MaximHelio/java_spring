import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        int C = Integer.parseInt(B);

        String str1 = B.substring(2);   // 일의 자리 5
        int int1 = Integer.parseInt(str1);
        String str2 = B.substring(1,2); // 십의 자리 8
        int int2 = Integer.parseInt(str2);
        String str3 = B.substring(0,1); // 백의 자리 3
        int int3 = Integer.parseInt(str3);

        System.out.println(A* int1);
        System.out.println(A * int2 );
        System.out.println(A * int3);
        System.out.println(A * C);


        sc.close();
    }
}
