import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap he so b: ");
        double b = sc.nextDouble();
        if (a == 0){
            System.out.println("Phuong trinh vo nghiem!");
        } else if (b == 0) {
            System.out.println("Phuong trinh vo so nghiem!");
        } else {
            double x = -b/a;
            System.out.println("Phuong trinh co nghiem: x = "+x);
        }
    }
}
