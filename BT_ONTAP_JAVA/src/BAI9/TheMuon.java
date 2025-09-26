package BAI9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon147;
    private LocalDate ngayMuon147;
    private LocalDate hanTra147;
    private String soHieu147;

    public TheMuon() {
    }

    public TheMuon(int soMuon147, LocalDate ngayMuon147, LocalDate hanTra147, String soHieu147) {
        this.soMuon147 = soMuon147;
        this.ngayMuon147 = ngayMuon147;
        this.hanTra147 = hanTra147;
        this.soHieu147 = soHieu147;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("\tNhập số mượn: ");
        soMuon147 = sc.nextInt();
        sc.nextLine();

        System.out.print("\tNhập ngày mượn (dd-MM-yyyy): ");
        String strNgayMuon = sc.nextLine();
        ngayMuon147 = LocalDate.parse(strNgayMuon, formatter);

        System.out.print("\tNhập hạn trả (dd-MM-yyyy): ");
        String strHanTra = sc.nextLine();
        hanTra147 = LocalDate.parse(strHanTra, formatter);

        System.out.print("\tNhập số hiệu: ");
        soHieu147 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSố phiếu mượn: " + soMuon147);
        System.out.println("\tNgày mượn: " + ngayMuon147);
        System.out.println("\tHạn trả: " + hanTra147);
        System.out.println("\tSố hiệu: " + soHieu147);
    }

    public LocalDate getHanTra147() {
        return hanTra147;
    }
}
