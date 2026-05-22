
import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c =2*n-1;
        for(int i=1;i<=2*n;i++){
            int f=1;
            for(int j=1;j<=c;j++){
                if((i+c/2>=j && i-2*n/2<=j )&&(i+j>=c-(c/2-1) && i+j<=c+(c/2+2))){// i+C=j and i+j=n-1
                    if(f==1)System.out.print("*");
                    else System.out.print(" ");
                    f=1-f;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
