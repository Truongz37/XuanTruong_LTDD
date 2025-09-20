/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThiSinh {
    //Số báo danh, họ tên, địa chỉ, diện ưu tiên khu vực
    private int soBD147;
    private String hoTen147;
    private String diaChi147;
    private String dienUuTien147;

    public ThiSinh() {
    }

    public ThiSinh(int soBD147, String hoTen147, String diaChi147, String dienUuTien147) {
        this.soBD147 = soBD147;
        this.hoTen147 = hoTen147;
        this.diaChi147 = diaChi147;
        this.dienUuTien147 = dienUuTien147;
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("\tNhập số báo danh: ");
        soBD147 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhập họ tên: ");
        hoTen147 = sc.nextLine();
        System.out.print("\tNhập địa chỉ: ");
        diaChi147 = sc.nextLine();
        System.out.print("\tNhập diện ưu tiên: ");
        dienUuTien147 = sc.nextLine();
    }
    public void hienThongTin(){
	System.out.println("\tSố báo danh: " + soBD147);
	System.out.println("\tHọ tên: " + hoTen147);
	System.out.println("\tĐịa chỉ: " + diaChi147);
	System.out.println("\tDiện ưu tiên: " + dienUuTien147);
    }

    public int getSoBD147() {
        return soBD147;
    }
     
}
