import java.util.Scanner;

public class lastKDigit{
    static long lastsecond(long n,int k){ // return last Kth digit
        return (n/(long)Math.pow(10, k-1))%10;
        
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        System.out.println(lastsecond(n,k));
    }
}