/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachSan {
    private ArrayList<KhachTro> ds147;
    public KhachSan() {
	ds147 = new ArrayList<KhachTro>(10);
    }   

    public void themKhachTro(KhachTro kt147) {
	ds147.add(kt147);
    }

    public void nhapDanhSach(Scanner sc) {
	KhachTro khach;

	System.out.print("Nhập vào số lượng khách: ");
	int n = sc.nextInt();
	sc.nextLine();
	System.out.println("Nhập vào thông tin khách trọ:");
	for (int i = 0; i < n; i++) {
		System.out.println("Khách trọ thứ " + (i + 1) + " là:");
		khach = new KhachTro();
		khach.nhapThongTin(sc);
		themKhachTro(khach);
	}
    }

    public void hienThiDanhSach() {
	for (KhachTro khach : ds147) {
		khach.hienThiThongTin();
	}
    }

    public double tinhTien(int CMND) {
	double tien = 0;

	for (KhachTro khach : ds147) {
		if (khach.getCMND147() == CMND) {
			tien = khach.getSoNgayTro147()* khach.getGiaPhong147();
		}
	}
	return tien;
    }
}
