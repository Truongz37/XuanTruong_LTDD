/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main4 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	TuyenSinh dsTuyenSinh147 = new TuyenSinh();
	System.out.println("Nhập vào thí sinh: ");
	dsTuyenSinh147.nhapDanhSach(sc);
	System.out.println("Danh sách thí sinh dự thi:");
	dsTuyenSinh147.hienThiDanhSach();
	System.out.print("Nhập số báo danh cần tìm: ");
	int soBaoDanh147 = sc.nextInt();
	sc.nextLine();
	dsTuyenSinh147.timKiemThiSinh(soBaoDanh147);
	sc.close();
	}
}
