import java.util.Scanner;

public class bai10_scanner {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("R = ");
        double r = sc.nextDouble();
        double cv = 2*Math.PI*r;
        double dt = Math.PI*Math.pow(r,2);
        System.out.println("CV = " + cv);
        System.out.println("DT = " + dt);
    }
}
