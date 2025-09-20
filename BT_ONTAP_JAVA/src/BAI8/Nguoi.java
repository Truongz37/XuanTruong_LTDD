/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi {
    protected String hoTen147;
    protected String ngaySinh147;
    protected String queQuan147;

    public Nguoi() {
    }

    public Nguoi(String hoTen147, String ngaySinh147, String queQuan147) {
        this.hoTen147 = hoTen147;
        this.ngaySinh147 = ngaySinh147;
        this.queQuan147 = queQuan147;
    }

    public void nhapThongTin(Scanner sc) {
	System.out.print("\tNhập họ tên: ");
	hoTen147 = sc.nextLine();
	System.out.print("\tNhập ngày sinh: ");
	ngaySinh147 = sc.nextLine();
	System.out.print("\tNhập quê quán: ");
	queQuan147 = sc.nextLine();
    }

    public void hienThiThongTin() {
	System.out.println("\tHọ tên: " + hoTen147);
	System.out.println("\tNgày sinh: " + ngaySinh147);
	System.out.println("\tQuê quán: " + queQuan147);
    }
}
