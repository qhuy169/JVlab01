import java.util.Scanner;

public class Lab01_bth3 {
    public static void main(String[] args) {
        String tenSinhVien;
        int tuoi;
        float diemLyThuyet;
        float diemThucHanh;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten:");
        tenSinhVien = input.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = input.nextInt();
        System.out.println("Nhap diem ly thuyet:");
        diemLyThuyet = input.nextFloat();
        System.out.println("Nhap diem thuc hanh:");
        diemThucHanh = input.nextFloat();

        float diemTrungBinh = (diemLyThuyet+diemThucHanh)/2;

        System.out.println("Ten:" +tenSinhVien);
        System.out.println("Tuoi:" +tuoi);
        System.out.println("Diem trung binh:" + diemTrungBinh);
    }
}
