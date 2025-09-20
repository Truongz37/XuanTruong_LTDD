/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	QuanLy ql147 = new QuanLy();
	ql147.nhapDanhSach(sc);
	System.out.println("Danh sách biên lai của các hộ gia đình là:");
	ql147.hienThiDanhSach();

	sc.close();
    }

}
