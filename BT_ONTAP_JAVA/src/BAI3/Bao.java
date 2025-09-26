/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bao extends TaiLieu{
    private String ngayPhatHanh147;

    public Bao() {
    }


    public Bao(String ngayPhatHanh147, String maTaiLieu147, String tenNXB147, int soBanPhatHanh147) {
        super(maTaiLieu147, tenNXB147, soBanPhatHanh147);
        this.ngayPhatHanh147 = ngayPhatHanh147;
    }
        public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhập ngày phát hành: ");
        ngayPhatHanh147 = sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.print("\tNgày phát hành: " +ngayPhatHanh147);
    }
}
