/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPhatHanh147;
    private int thangPhatHanh147;

    public TapChi() {
    }

    public TapChi(int soPhatHanh147, String maTaiLieu147, String tenNXB147, int soBanPhatHanh147, int thangPhatHanh147) {
        super(maTaiLieu147, tenNXB147, soBanPhatHanh147);
        this.soPhatHanh147 = soPhatHanh147;
        this.thangPhatHanh147 = thangPhatHanh147;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\tNhập số phát hành: ");
        soPhatHanh147 = sc.nextInt();
        sc.nextLine();
        thangPhatHanh147 = sc.nextInt();
        sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tSố phát hành: " + soPhatHanh147);
        System.out.println("\tTháng phát hành: "+thangPhatHanh147);
    }
}
