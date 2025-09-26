/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CongNhan extends CanBo{
    private String bac147;

    public CongNhan() {
    }

    public CongNhan(String bac147, String hoTen147, String ngaySinh147, String gioiTinh147) {
        super(hoTen147, ngaySinh147, gioiTinh147);
        this.bac147 = bac147;
    }


    public void nhapThongTin(Scanner sc) {
	super.nhapThongTin(sc);
	System.out.print("\tNhập bậc: ");
	bac147 = sc.nextLine();
    }

    public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tBậc: " + bac147);
    }

}
