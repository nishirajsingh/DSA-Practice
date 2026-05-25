
import java.util.Scanner;

public class countlastsecond{
    static int lastsecond(int n){
        if (n<9) return 0;
        return (n/10)%10;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lastsecond(n));
    }
}