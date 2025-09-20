package BAI9;

import java.time.LocalDate;
import java.util.Scanner;

public class SinhVien {
    protected String hoTen147;
    protected String maSV147;
    protected LocalDate ngaySinh147;
    protected String lop147;

    public SinhVien() {
    }

    public SinhVien(String hoTen147, String maSV147, LocalDate ngaySinh147, String lop147) {
        this.hoTen147 = hoTen147;
        this.maSV147 = maSV147;
        this.ngaySinh147 = ngaySinh147;
        this.lop147 = lop147;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập họ tên: ");
        hoTen147 = sc.nextLine();
        System.out.print("\tNhập mã sinh viên: ");
        maSV147 = sc.nextLine();
        System.out.print("\tNhập ngày sinh (dd-MM-yyyy): ");
        String strNgaySinh = sc.nextLine();
        ngaySinh147 = LocalDate.parse(strNgaySinh, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.print("\tNhập lớp: ");
        lop147 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen147);
        System.out.println("\tNgày sinh: " + ngaySinh147);
        System.out.println("\tMã sinh viên: " + maSV147);
        System.out.println("\tLớp: " + lop147);
    }
}
