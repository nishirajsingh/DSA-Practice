import java.util.*;
public class rotatek{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp=n,d=0;
        while(temp!=0){
            d++;
            temp/=10;
        }
        // System.out.println(d);
        
    }
}