/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi {
    protected String hoTen147;
    protected Date ngaySinh147;
    protected int CMND147;

    public Nguoi() {

    }

    public Nguoi(String hoTen147, Date ngaySinh147, int CMND147) {
        this.hoTen147 = hoTen147;
        this.ngaySinh147 = ngaySinh147;
        this.CMND147 = CMND147;
    }
        

    public void nhapThongTin(Scanner sc) {
	System.out.print("\tNhập họ tên: ");
	hoTen147 = sc.nextLine();
	System.out.print("\tNhập ngày sinh: ");
	String strDate = sc.nextLine();
	ngaySinh147 = strToDate(strDate);
	System.out.print("\tNhập CMND: ");
	CMND147 = sc.nextInt();
    }

    private Date strToDate(String strDate147) {
	Date date147 = null;
	SimpleDateFormat sdf147 = new SimpleDateFormat("dd-MM-yyyy");

	try {
		date147 = sdf147.parse(strDate147);
	} catch (ParseException e) {
		System.out.println("Lỗi định dạng ngày tháng!");
	}

		return date147;
    }

    public void hienThiThongTin() {
		System.out.println("\tHọ tên: " + hoTen147);
		System.out.println("\tNgày sinh: " + ngaySinh147);
		System.out.println("\tCMND: " + CMND147);
    }

    public int getCMND147() {
        return CMND147;
    }
    
}
