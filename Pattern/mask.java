import java.util.Scanner;

public class mask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j =1;j<=2*n;j++){
                int s=(i<=n)?i:2*n-i;
                if(j>s && j<=2*n-s){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.err.println();
        }
    }
}