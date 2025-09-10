public class bai8_toantugan {
    public static void main(String[] args) {
        //gán cộng
        int x = 8;
        //x+=5 //x=x+5
        x+=5;
        System.out.println("x = " +x);

        //gán trừ
        int x2 = 8;
        x2-=5;
        System.out.println("x2 = " +x2);

        //gán nhân
        int x3 = 8;
        x3*=5;
        System.out.println("x3 = " +x3);

        int a = 7;
        int b = 9;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        a = 6;
        System.out.println("a+=3: " + (a+=3));
        System.out.println("a-=5: " + (a-=5));
        System.out.println("a*=2: " + (a*=2));
        System.out.println("a%=5: " + (a%=5));
        b=2;

        System.out.println("a-=(b+7): " +(a-=(b+7)));
    }
}
