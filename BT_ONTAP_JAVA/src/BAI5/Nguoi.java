/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoTen147;
    private LocalDate ngaySinh147;
    private String ngheNghiep147;

    public Nguoi() {
    }

    public Nguoi(String hoTen147, LocalDate ngaySinh147, String ngheNghiep147) {
        this.hoTen147 = hoTen147;
        this.ngaySinh147 = ngaySinh147;
        this.ngheNghiep147 = ngheNghiep147;
    }
    public void nhapThongTin(Scanner sc){
            System.out.print("\tNhập họ tên: ");
            hoTen147 = sc.nextLine();
            System.out.print("\tNhập ngày sinh: ");
            String strDate = sc.nextLine();
            ngaySinh147 = strToDate(strDate);
            System.out.print("\tNhập nghề nghiệp: ");
            ngheNghiep147 = sc.nextLine();
	}

    private LocalDate strToDate(String ns147) {
        DateTimeFormatter dtf147 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(ns147, dtf147);
    }

    public void hienThiThongTin(){
        System.out.println("Họ tên: "+ hoTen147);
        System.out.println("Ngày sinh: "+ dateToString(ngaySinh147));
        System.out.println("Nghề nghiệp: "+ngheNghiep147);
    }
    public String dateToString(LocalDate ns147) {
        DateTimeFormatter dtf147 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return ns147.format(dtf147);
    }


    public LocalDate getNgaySinh147() {
        return ngaySinh147;
    }

    
}
