/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	QLHS list147=new QLHS();
	list147.nhapDanhSachHS(sc);
        System.out.print("Những học sinh sinh năm 1985 và quê ở Thái Nguyên là:");
        list147.timKiemThongTin(1985, "Thái Nguyên");
	System.out.println("Những học sinh lớp 10A1 là:");
	list147.timKiemThongTin("10A1");
	sc.close();
    }
}
