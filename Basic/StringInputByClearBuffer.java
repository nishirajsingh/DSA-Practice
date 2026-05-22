
import java.util.Scanner;

public class StringInputByClearBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2  = sc.nextInt();
        System.out.println(n+n2);
        sc.nextLine();
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s+" "+s2);
    }
}
