package BAI7;

import java.util.Scanner;

public class HocSinh extends Nguoi {
    private String lop147;
    private String khoaHoc147;
    private String kyHoc147;

    public HocSinh() {
    }

    public HocSinh(String hoTen147, String lop147, String khoaHoc147, String kyHoc147) {
        this.hoTen147 = hoTen147;
        this.lop147 = lop147;
        this.khoaHoc147 = khoaHoc147;
        this.kyHoc147 = kyHoc147;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập lớp: ");
        lop147 = sc.nextLine();
        System.out.print("\tNhập khóa học: ");
        khoaHoc147 = sc.nextLine();
        System.out.print("\tNhập kỳ học: ");
        kyHoc147 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tLớp: " + lop147);
        System.out.println("\tKhóa học: " + khoaHoc147);
        System.out.println("\tKỳ học: " + kyHoc147);
    }

    public String getLop() {
        return lop147;
    }
}
