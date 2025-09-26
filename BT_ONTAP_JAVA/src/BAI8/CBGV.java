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
public class CBGV extends Nguoi {
    private double luongCung147;
    private double thuong147;
    private double phat147;
    private double luongThucLinh147;
    public CBGV() {
    }

    public void nhapThongTin(Scanner sc) {
	super.nhapThongTin(sc);
	System.out.print("\tNhập lương cứng: ");
	luongCung147 = sc.nextDouble();
	sc.nextLine();
	System.out.print("\tNhập thưởng: ");
	thuong147 = sc.nextDouble();
	sc.nextLine();
	System.out.print("\tNhập phạt: ");
	phat147 = sc.nextDouble();
	sc.nextLine();
	luongThucLinh147 = luongCung147 + thuong147 - phat147;
    }

    public void hienThiThongTin() {
	super.hienThiThongTin();
        System.out.printf("\tLương cứng: %.0f\n", luongCung147);
        System.out.printf("\tThưởng: %.0f\n", thuong147);
        System.out.printf("\tPhạt: %.0f\n", phat147);
        System.out.printf("\tLương thực lĩnh: %.0f\n", luongThucLinh147);
    }
    public double getLuongThucLinh() {
	return luongThucLinh147;
    }

}
