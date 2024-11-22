import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n1: ");
        int n1 = sc.nextInt();
        System.out.println("Nhap so nguyen m1: ");
        int m1 = sc.nextInt();
        System.out.println("Nhap so thuc n2: ");
        float n2 = sc.nextFloat();
        System.out.println("Nhap so thuc m2: ");
        float m2 = sc.nextFloat();
        float m3 = n1+n2;
        System.out.println("Tong 2 so nguyen n1 va m1 la: "+(n1+m1));
        System.out.println("Tong 2 so thuc n2 va m2 la: "+(n2+m2));
        System.out.println("Tong 2 so thuc n1 va n2 la: "+m3);
    }
}
