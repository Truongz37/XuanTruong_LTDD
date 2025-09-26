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
public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	QuanLySach qls147 = new QuanLySach();
	qls147.nhapDSTL(sc);
	System.out.print("\nNhập vào loại tài liệu cần tìm: ");
	String loai147 = sc.nextLine();
	qls147.timLoaiTL(loai147);
	System.out.print("\nNhập mã tài liệu cần tìm: ");
	String maTL147 = sc.nextLine();
	qls147.timMaTL(maTL147);
	sc.close();
	}

}
