import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen: ");
        int a = sc.nextInt();
        System.out.print("Nhap 1 so thuc: ");
        float b = sc.nextFloat();
        System.out.print("Nhap 1 chuoi: ");
        String c = sc.nextLine();
        System.out.println("So nguyen vua nhap la:" +a);
        System.out.println("So thuc vua nhap la:" +b);
        System.out.println("Chuoi vua nhap la:" +c);
    }
}
