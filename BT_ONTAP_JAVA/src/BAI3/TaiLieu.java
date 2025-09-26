/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;
import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu147;
    private String tenNXB147;
    private int soBanPhatHanh147;
    public TaiLieu() {
    }
    public TaiLieu(String maTaiLieu147, String tenNXB147, int soBanPhatHanh147) {
        this.maTaiLieu147 = maTaiLieu147;
        this.tenNXB147 = tenNXB147;
        this.soBanPhatHanh147 = soBanPhatHanh147;
    }
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập mã tài liệu: ");
        maTaiLieu147 = sc.nextLine();
        System.out.print("\tNhập tên nhà xuất bản: ");
        tenNXB147 = sc.nextLine();
        System.out.print("\tNhập số bản phát hành: ");
        soBanPhatHanh147 = sc.nextInt();
        sc.nextLine();
    }
    public void hienThiThongTin() {
        System.out.println("\tMã tài liệu: " + maTaiLieu147);
        System.out.println("\tTên nhà xuất bản: " + tenNXB147);
        System.out.println("\tSố bản phát hành: " + soBanPhatHanh147);
    }
    public String getMaTaiLieu() {
        return maTaiLieu147;
    }
}
