package BAI7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HocSinh> dshs147;

    public QLHS() {
        dshs147 = new ArrayList<HocSinh>(10);
    }

    public void themHS(HocSinh hs147) {
        dshs147.add(hs147);
    }

    public void nhapDanhSachHS(Scanner sc) {
        HocSinh hs;
        System.out.print("Nhập vào số lượng học sinh: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Nhập thông tin cho học sinh trong danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.println("\tHọc sinh thứ " + (i + 1) + " là:");
            hs = new HocSinh();
            hs.nhapThongTin(sc);
            themHS(hs);
        }
    }

    public void hienThiDanhSach() {
        int n = dshs147.size();
        for (int i = 0; i < n; i++) {
            System.out.println("\tHọc sinh thứ " + (i + 1) + " là:");
            dshs147.get(i).hienThiThongTin();
        }
    }

    public void timKiemThongTin(int nam, String que) {
        for (HocSinh hs : dshs147) {
            LocalDate ns = hs.getNgaySinh();
            if (ns != null && ns.getYear() == nam && que.equals(hs.getQueQuan())) {
                hs.hienThiThongTin();
            }
        }
    }

    public void timKiemThongTin(String lop) {
        for (HocSinh hs : dshs147) {
            if (lop.equals(hs.getLop())) {
                hs.hienThiThongTin();
            }
        }
    }
}
