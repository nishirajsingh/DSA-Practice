
import java.util.Scanner;

public class pattern3 {
    static void printPattern(int i,int j,int n,int a){
        if(i+a/2==j || i+j==a/2+2 || (i==n/2+1 && (j>=i && j<=a-i+1)) ) System.out.print("*");// i+C=j
        else System.out.print(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                printPattern(i, j, n,2*n-1);
            }
            System.out.println();
        }
    }
}
