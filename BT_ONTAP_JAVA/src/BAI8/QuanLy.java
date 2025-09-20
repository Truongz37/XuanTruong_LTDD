/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLy {
    private ArrayList<CBGV> ds147;
    public QuanLy() {
        ds147 = new ArrayList<CBGV>(10);
    }
    public void themCBGV(CBGV canBo147) {
        ds147.add(canBo147);
    }
    public void nhapDanhSach(Scanner sc) {
        CBGV canBo147;
	System.out.print("Nhập vào số lượng cán bộ: ");
	int n = sc.nextInt();
	sc.nextLine();
	System.out.println("Nhập vào danh sách:");
	for (int i = 0; i < n; i++) {
            System.out.println("Cán bộ thứ " + (i + 1) + " là:");
            canBo147 = new CBGV();
            canBo147.nhapThongTin(sc);
            themCBGV(canBo147);
	}
    }

    public void hienThiDanhSach() {
	for (CBGV cb147 : ds147) {
            cb147.hienThiThongTin();
	}
    }

    public void timKiem(double luong147) {
	for (CBGV cb : ds147) {
            if (cb.getLuongThucLinh() >= luong147) {
		cb.hienThiThongTin();
            }
        }
    }
}
