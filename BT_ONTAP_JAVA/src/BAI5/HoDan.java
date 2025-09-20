/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HoDan{
    private int soNguoi147;
    private int soNha147;
    private List<Nguoi> dsThanhVien147 = new ArrayList<>();

    public HoDan(int soNguoi147, int soNha147) {
        this.soNguoi147 = soNguoi147;
        this.soNha147 = soNha147;
    }
    public HoDan() {
    }

    public void nhapThongTin(Scanner sc){
        System.out.println("Nhập sô nhà: ");
        soNha147 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số thành viên: ");
        soNguoi147 = sc.nextInt();
        sc.nextLine();
        for(int i =1; i<=soNguoi147;i++)
        {
            System.out.println("Nhập thông tin thành viên thứ "+i+" : ");
            Nguoi tv147 = new Nguoi();
            tv147.nhapThongTin(sc);
            dsThanhVien147.add(tv147);
        }
    }

    public int getSoNha147() {
        return soNha147;
    }
    public void hienThi(){
        System.out.println("Số nhà: "+soNha147);
        System.out.println("Số thành viên: "+soNguoi147);
        System.out.println("Danh sách thành viên:");
        for (Nguoi nguoi147 : dsThanhVien147) {
            nguoi147.hienThiThongTin();    
        }
    }

    public int getSoNguoi147() {
        return soNguoi147;
    }

    public List<Nguoi> getDsThanhVien147() {
        return dsThanhVien147;
    }
    
    
}
