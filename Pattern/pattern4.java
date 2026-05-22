import java.util.Scanner;

public class pattern4 {
    // static void printPattern(int i,int j,int n,int a){
    //     if(i+a/2>j && i+j<a/2+2 || i+a/2<j && i+j>a/2+2) System.out.print(" ");// i+C=j
    //     else System.out.print("*");
    // }
    static void printPattern(int i,int j,int n,int a){
        if(i+j>=n-1 && i+(n-1)>=j || i-n+j>=n-1 && i-n+(n-1)>=j) System.out.print(" ");// i+C=j
        else System.out.print("*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<2*n;i++){
            for(int j=0;j<2*n-1;j++){
                printPattern(i, j, n,2*n-1);
            }
            System.out.println();
        }
    }
}
