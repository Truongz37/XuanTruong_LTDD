/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho khuPho147 = new KhuPho();
        khuPho147.nhapHoDan(sc);
        khuPho147.hienThiDS();
        System.out.println("Danh sách hộ dân có người 80 tuổi: ");
        khuPho147.timKiemTT();

    }
}
