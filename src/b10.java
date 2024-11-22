import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap he so b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap he so c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0){
                System.out.println("Phuong trinh vo nghiem!");
            } else if (c == 0) {
                System.out.println("Phuong trinh vo so nghiem!");
            } else {
                double x = -c/b;
                System.out.println("Phuong trinh co nghiem: x = "+x);
            }
        } else {
            double d = b*b - 4*a*c;
            if (d < 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else if (d == 0) {
                double x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep: x = "+x);
            } else {
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet!");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
        }
    }
}
