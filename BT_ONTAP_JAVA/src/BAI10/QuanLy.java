/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLy {
private ArrayList<BienLai> ds147;

public QuanLy() {
	ds147 = new ArrayList<BienLai>(10);
}

    public void themBienLai(BienLai bienLai) {
	ds147.add(bienLai);
    }

    public void nhapDanhSach(Scanner sc) {
	BienLai bienLai147;
	System.out.print("Nhập vào số lượng biên lai: ");
	int n = sc.nextInt();
	sc.nextLine();
	System.out.println("Nhập vào danh sách biên lai:");
	for (int i = 0; i < n; i++) {
		System.out.println("Biên lai thứ " + (i + 1) + " là:");
		bienLai147 = new BienLai();
		bienLai147.nhapThongTin(sc);

		themBienLai(bienLai147);
	}
    }

    public void hienThiDanhSach() {
	for (int i = 0; i < ds147.size(); i++) {
            System.out.println("Biên lai thứ " + (i + 1) + " là:");
            ds147.get(i).hienThiThongTin();
            System.out.println();
	}
    }
    
}
