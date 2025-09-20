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
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb147 = new QLCB(); //kh  ởi tạo danh sách gồm 10 cán bộ
        qlcb147.nhapDanhSach(sc);
        System.out.print("Nhập vào họ tên cần tìm kiếm: ");
        String hoTenTK147 = sc.nextLine();
        qlcb147.timKiemCanBo(hoTenTK147);
        
        
        sc.close();
    }
}
