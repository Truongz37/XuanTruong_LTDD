/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main1 {
    public static void main(String[] args) {
        PhanSo ps1147= new PhanSo();
        PhanSo ps2147 = new PhanSo(); 
        PhanSo psTong147 = new PhanSo();
        PhanSo psHieu147 = new  PhanSo();
        PhanSo psNhan147 = new  PhanSo();
        PhanSo psChia147 = new  PhanSo();
        //nhập phân số
        System.out.println("Nhập vào phân số thứ nhất: ");
        Scanner sc = new Scanner(System.in);
        ps1147.nhapPS(sc);
        System.out.println("Nhập vào phân số thứ hai: ");
        ps2147.nhapPS(sc);
        
        //cộng
        psTong147 = ps1147.congPS(ps2147);
        psTong147.toiGianPhanSo();
        //trừ
        psHieu147 = ps1147.truPS(ps2147);
        psHieu147.toiGianPhanSo();
        //nhân
        psNhan147 = ps1147.nhanPS(ps2147);
        psNhan147.toiGianPhanSo();
        //chia
        psChia147 = ps1147.chiaPS(ps2147);
        psChia147.toiGianPhanSo();
        //hiển thị phân số
        System.out.println("Phân số thứ nhất là: ");
        ps1147.xuatPS();
        System.out.println("Phân số thứ hai là: ");
        ps2147.xuatPS();
        System.out.print("Tổng hai phân số là: ");
        psTong147.xuatPS();
        System.out.print("Hiệu hai phân số là: ");
        psHieu147.xuatPS();
        System.out.print("Tích hai phân số là: ");
        psNhan147.xuatPS();
        System.out.print("Chia hai phân số là: ");
        psChia147.xuatPS();
        System.out.println("Kiểm tra phân số 1 và 2 có tối giản hay không?");
        if(ps1147.kiemTraToiGian() && ps2147.kiemTraToiGian()){
            System.out.println("Cả hai là phân số tối giản");
        }
        else if (!ps1147.kiemTraToiGian() && ps2147.kiemTraToiGian()) {
            System.out.println("Phân số 1 chưa tối giản");
            System.out.print("Phân số tối giản là: ");
            ps1147.toiGianPhanSo(); 
            ps1147.xuatPS();
        } 
        else if (ps1147.kiemTraToiGian() && !ps2147.kiemTraToiGian()) {
            System.out.println("Phân số 2 chưa tối giản");
            System.out.print("Phân số tối giản là: ");
            ps2147.toiGianPhanSo(); 
            ps2147.xuatPS();
        } 
        else {
            System.out.println("Cả hai phân số chưa tối giản");
            System.out.print("Phân số 1 tối giản: ");
            ps1147.toiGianPhanSo();
            ps1147.xuatPS();
            System.out.print("Phân số 2 tối giản: ");
            ps2147.toiGianPhanSo();
            ps2147.xuatPS();
        }
        sc.close();
    }
}
