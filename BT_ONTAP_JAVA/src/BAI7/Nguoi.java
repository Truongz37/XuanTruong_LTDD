package BAI7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen147;
    protected LocalDate ngaySinh147;
    protected String queQuan147;

    public Nguoi() {
    }

    public Nguoi(String hoTen147, LocalDate ngaySinh147, String queQuan147) {
        this.hoTen147 = hoTen147;
        this.ngaySinh147 = ngaySinh147;
        this.queQuan147 = queQuan147;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập họ tên: ");
        hoTen147 = sc.nextLine();
        System.out.print("\tNhập ngày sinh (dd-MM-yyyy): ");
        String strDate = sc.nextLine();
        ngaySinh147 = strToDate(strDate);
        System.out.print("\tNhập quê quán: ");
        queQuan147 = sc.nextLine();
    }

    private LocalDate strToDate(String strDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            return LocalDate.parse(strDate, dtf);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày tháng!");
            return null;
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen147);
        System.out.println("\tNgày sinh: " + ngaySinh147);
        System.out.println("\tQuê quán: " + queQuan147);
    }

    public String getQueQuan() {
        return queQuan147;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh147;
    }
}
