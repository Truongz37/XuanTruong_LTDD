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
public class CanBo {
    private String hoTen147;
    private String ngaySinh147;
    private String gioiTinh147;
    private String diaChi147;

    public CanBo() {
    }

    public CanBo(String hoTen147, String ngaySinh147, String gioiTinh147) {
        this.hoTen147 = hoTen147;
        this.ngaySinh147 = ngaySinh147;
        this.gioiTinh147 = gioiTinh147;
    }

    public void nhapThongTin(Scanner sc){
        System.out.print("Nhập họ tên cán bộ: ");
        hoTen147= sc.nextLine();
        System.out.print("Nhập ngày sinh cán bộ(dd/mm/yyyy): ");
        ngaySinh147= sc.nextLine();
        System.out.print("Nhập giới tính cán bộ: ");
        gioiTinh147= sc.nextLine();
        System.out.print("Nhập địa chỉ cán bộ: ");
        diaChi147= sc.nextLine();
    }

    public String getHoTen() {
        return this.hoTen147;
    }
    public void hienThiThongTin(){
        System.out.println("\tHọ tên: "+hoTen147);
        System.out.println("\tNgày sinh: "+ngaySinh147);
        System.out.println("\tGiới tính: "+gioiTinh147);
        System.out.println("\tĐịa chỉ: "+diaChi147);
    }
}
