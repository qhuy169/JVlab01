import java.util.Scanner;

public class b78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n so cach nhau bang dau cach: ");
        String nhap = sc.nextLine();
        String [] so = nhap.split(" ");
        int [] ss = new int[so.length];
        for(int i = 0; i < so.length; i++){
            ss[i] = Integer.parseInt(so[i]);
        }
        int min = ss[0];
        int max = ss[0];
        for (int sss : ss) {
            if (sss > max) max = sss;
            if (sss < min) min = sss;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
