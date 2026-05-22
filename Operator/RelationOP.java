public class RelationOP {
    public static void main(String[] args) {
        {int a=5,b=6;
        System.out.println(!(a<b));
        System.out.println((a>b)||(a==b));
        System.out.println((a<b)&&(a!=b));
        System.out.println((a>b)&&(a+10<b)||(a<b));

        System.out.println((5<6)&&(7>10)||(9>10)&&(8<10));
        // t && f || f && t
        if (5<6) {System.out.println("R1");
        System.out.println("R2");}
        }
    }
}
//t || f && t