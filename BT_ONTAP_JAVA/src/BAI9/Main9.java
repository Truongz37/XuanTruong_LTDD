/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	QuanLy ql147 = new QuanLy();
	ql147.nhapDanhSach(sc);

	System.out.println("Danh sách sinh viên trả sách vào cuối tháng:");
	ql147.hienThiDanhSachTraCuoiThang();
	sc.close();
	}
}
