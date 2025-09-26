/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sach extends TaiLieu{
    private String tacGia147;
    private int soTrang147;

    public Sach() {
    }

    public Sach(String tacGia147, int soTrang147, String maTaiLieu147, String tenNXB147, int soBanPhatHanh147) {
        super(maTaiLieu147, tenNXB147, soBanPhatHanh147);
        this.tacGia147 = tacGia147;
        this.soTrang147 = soTrang147;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhập tên tác giả: ");
        tacGia147 = sc.nextLine();
        System.out.print("\tNhập số trang: ");
        soTrang147 = sc.nextInt();
        sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tTên tác giả: " +tacGia147);
        System.out.println("\tSố trang: "+soTrang147);
    }
}
