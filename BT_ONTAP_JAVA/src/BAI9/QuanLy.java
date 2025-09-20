package BAI9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds147;

    public QuanLy() {
        ds147 = new ArrayList<>(10);
    }

    public void themTheMuon(TheMuon theMuon) {
        ds147.add(theMuon);
    }

    public void nhapDanhSach(Scanner sc) {
        TheMuon theMuon147;
        System.out.print("Nhập vào số lượng thẻ mượn: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thẻ mượn thứ " + (i + 1) + " là:");
            theMuon147 = new TheMuon();
            theMuon147.nhapThongTin(sc);
            themTheMuon(theMuon147);
        }
    }

    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the147 : ds147) {
            int lastDay = the147.getHanTra147().lengthOfMonth(); 
            if (the147.getHanTra147().getDayOfMonth() == lastDay) {
                the147.hienThiThongTin();
            }
        }
    }
}
