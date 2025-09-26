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
public class BienLai extends KhachHang{
    private int chiSoMoi147;
    private int chiSoCu147;
    private double tien147;

    public BienLai() {
    }

    public BienLai(int chiSoMoi147, int chiSoCu147, double tien147) {
        this.chiSoMoi147 = chiSoMoi147;
        this.chiSoCu147 = chiSoCu147;
        this.tien147 = tien147;
    }

    

    public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
	this.tenChuHo147 = tenChuHo;
	this.chiSoMoi147 = chiSoMoi;
	this.chiSoCu147 = chiSoCu;
	this.tien147 = tien;
    }

public void nhapThongTin(Scanner sc) {
	super.nhapThongTin(sc);
	System.out.print("\tNhập chỉ số mới: ");
	chiSoMoi147 = sc.nextInt();
	sc.nextLine();
	System.out.print("\tNhập chỉ số cũ: ");
	chiSoCu147 = sc.nextInt();
	sc.nextLine();
	tien147 = (chiSoMoi147  - chiSoCu147) * 750;
}

    public void hienThiThongTin() {
	super.hienThiThongTin();
	System.out.println("\tChỉ số mới: " + chiSoMoi147);
	System.out.println("\tChỉ số cũ: " + chiSoCu147);
	System.out.println("\tTiền: : " + tien147);
    }
}
