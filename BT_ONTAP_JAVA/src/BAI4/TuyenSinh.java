/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TuyenSinh {
	private ArrayList<ThiSinh> dsts147;
	public TuyenSinh() {
            dsts147 = new ArrayList<ThiSinh>(10);
	}

	public void themThiSinh(ThiSinh ts) {
            dsts147.add(ts);
	}

        public void nhapDanhSach(Scanner sc) {
            ThiSinh ts147;
            int chon147;

            System.out.print("Nhập vào số lượng thí sinh: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
		System.out.println("Thí sinh thuộc khối nào (1-Khối A; 2-Khối B; 3-Khối C): ");
		chon147 = sc.nextInt();

		switch (chon147) {
		case 1:
			ts147 = new KhoiA("Toán", "Lý", "Hóa");
			break;
		case 2:
                        ts147 = new KhoiA("Toán", "Hóa", "Sinh");
			break;
		case 3:
			ts147 = new KhoiC("Văn", "Sử", "Địa");
			break;
		default:
			ts147 = new KhoiA("Toán", "Lý", "Hóa");
			break;
		}
		ts147.nhapThongTin(sc);
		themThiSinh(ts147);
            }
	}

	public void hienThiDanhSach() {
            int i = 1;
            for (ThiSinh TS147 : dsts147) {
                System.out.println("Thí sinh thứ " + (i++) + ":");
                TS147.hienThongTin();
            }
	}

	public void timKiemThiSinh(int soBaoDanh) {
            for (ThiSinh ts147 : dsts147) {
		if (ts147.getSoBD147()== soBaoDanh) {
			ts147.hienThongTin();
		}
            }
	}
}

