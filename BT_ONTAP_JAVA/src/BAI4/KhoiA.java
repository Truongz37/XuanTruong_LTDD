/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String mon1147;
    private String mon2147;
    private String mon3147;
    public KhoiA() {
    }
    public KhoiA(String mon1, String mon2, String mon3) {
	this.mon1147 = mon1;
	this.mon2147 = mon2;
	this.mon3147 = mon3;
    }   
    public void nhapThongTin(Scanner sc) {
	super.nhapThongTin(sc);
	System.out.print("\tNhập môn 1: ");
	mon1147 = sc.nextLine();
	System.out.print("\tNhập môn 2: ");
	mon2147  = sc.nextLine();
	System.out.print("\tNhập môn 3: ");
	mon3147 = sc.nextLine();
    }

    public void hienThiThongTin() {
	super.hienThongTin();
	System.out.println("\tTổ hợp các môn thi: " + mon1147 + " - " + mon2147 + " - " + mon3147);
    }
}

