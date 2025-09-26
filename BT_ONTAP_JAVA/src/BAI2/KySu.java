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
public class KySu extends CanBo {

    private String nganhDaoTao147;

    public KySu() {
    }

    public KySu(String nganhDaoTao147, String hoTen147, String ngaySinh147, String gioiTinh147) {
        super(hoTen147, ngaySinh147, gioiTinh147);
        this.nganhDaoTao147 = nganhDaoTao147;
    }

    public void nhapThongTin(Scanner sc) {
	super.nhapThongTin(sc);
	System.out.print("\tNhập ngành đào tạo: ");
	nganhDaoTao147 = sc.nextLine();
    }

    public void hienThiThongTin() {
      	super.hienThiThongTin();
        System.out.println("\tNgành đào tạo: " + nganhDaoTao147);
    }
}

