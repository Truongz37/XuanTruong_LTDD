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
public class KhachHang {
    protected String tenChuHo147;
    protected int soNha147;
    protected String maCongTo147;

    public KhachHang() {
    }

    public KhachHang(String tenChuHo147, int soNha147, String maCongTo147) {
        this.tenChuHo147 = tenChuHo147;
        this.soNha147 = soNha147;
        this.maCongTo147 = maCongTo147;
    }
    public void nhapThongTin(Scanner sc) {
	System.out.print("\tNhập tên chủ hộ: ");
	tenChuHo147 = sc.nextLine();
	System.out.print("\tNhập số nhà: ");
	soNha147 = sc.nextInt();
	sc.nextLine();
	System.out.print("\tNhập mã công tố: ");
	maCongTo147 = sc.nextLine();
    }

    public void hienThiThongTin() {
	System.out.println("\tTên chủ hộ: " + tenChuHo147);
	System.out.println("\tSố nhà: " + soNha147);
	System.out.println("\tMã công tố: " + maCongTo147);
    }
}
