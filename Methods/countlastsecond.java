
import java.util.Scanner;

public class countlastsecond{
    static long lastsecond(long n){ // return last second digit
        if (n<9) return 0;
        return (n/10)%10;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(lastsecond(n));
    }
}