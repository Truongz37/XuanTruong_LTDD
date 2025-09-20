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
public class NhanVien extends CanBo{
    private String congViec147;
    public NhanVien() {
    }

    public NhanVien(String congViec147, String hoTen147, String ngaySinh147, String gioiTinh147) {
        super(hoTen147, ngaySinh147, gioiTinh147);
        this.congViec147 = congViec147;
    }


    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập công việc: ");
        congViec147 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCông việc: " + congViec147);
    }

}
