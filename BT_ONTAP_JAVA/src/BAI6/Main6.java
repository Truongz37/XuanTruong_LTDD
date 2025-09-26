/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	KhachSan ql147 = new KhachSan();

	ql147.nhapDanhSach(sc);

	System.out.print("Nhập vào khách trọ cần tính tiền(CMND): ");
	int cmnd147 = sc.nextInt();

	System.out.println("Tổng tiền là: " + ql147.tinhTien(cmnd147));
	sc.close();
    }
}
