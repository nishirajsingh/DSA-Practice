
import java.util.Scanner;

public class Pattern2 {
    static void printPattern(int i,int j,int n){
        if(i+n/2==j || i-n/2==j || i==n/2+1 ||i+j==n-(n/2-1) || i+j==n+(n/2+1) || j==n/2+1) System.out.print("*");// i+C=j
        else System.out.print(" ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                printPattern(i, j, n);
            }
            System.err.println();
        }
    }
    
}
