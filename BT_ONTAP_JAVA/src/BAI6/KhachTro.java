/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachTro extends  Nguoi{
    private int soNgayTro147;
    private String loaiPhong147;
    private double giaPhong147;
	public KhachTro() {
	}
    public KhachTro(int soNgayTro147, String loaiPhong147, double giaPhong147) {
        this.soNgayTro147 = soNgayTro147;
        this.loaiPhong147 = loaiPhong147;
        this.giaPhong147 = giaPhong147;
    }  
    public KhachTro(int soNgayTro147, String loaiPhong147, double giaPhong147, String hoTen147, Date ngaySinh147, int CMND147) {
        super(hoTen147, ngaySinh147, CMND147);
        this.soNgayTro147 = soNgayTro147;
        this.loaiPhong147 = loaiPhong147;
        this.giaPhong147 = giaPhong147;
    }
    public KhachTro(String hoTen147, int CMND147, int soNgayTro147, String loaiPhong147, double giaPhong147) {
	this.hoTen147 = hoTen147;
	this.CMND147 = CMND147;
	this.soNgayTro147 = soNgayTro147;
	this.loaiPhong147 = loaiPhong147;
	this.giaPhong147 = giaPhong147;
    }   
    public void nhapThongTin(Scanner sc) {
	super.nhapThongTin(sc);
	System.out.print("\tNhập số ngày trọ: ");
	soNgayTro147 = sc.nextInt();
	sc.nextLine();
	System.out.print("\tNhập loại phòng: ");
	loaiPhong147 = sc.nextLine();
	System.out.print("\tNhập giá phòng: ");
	giaPhong147 = sc.nextDouble();
	sc.nextLine();
    }
    public void hienThiThongTin() {
	super.hienThiThongTin();

	System.out.println("\tSố ngày trọ: " + soNgayTro147);
	System.out.println("\tLoại phòng: " + loaiPhong147);
	System.out.println("\tGiá phòng: " + giaPhong147);
    }
    public String getLoaiPhong147() {
        return loaiPhong147;
    }
    public double getGiaPhong147() {
        return giaPhong147;
    }
    public int getSoNgayTro147() {
        return soNgayTro147;
    }
}
