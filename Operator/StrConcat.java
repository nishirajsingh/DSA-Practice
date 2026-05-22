import java.util.Scanner;
public class StrConcat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        String lname = sc.nextLine();
        System.out.println(fname+lname);
        sc.close();
    }
}