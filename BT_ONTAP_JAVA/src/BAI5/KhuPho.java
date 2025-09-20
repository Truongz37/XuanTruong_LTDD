  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhuPho {
    private ArrayList<HoDan> dsHD147= new ArrayList<>();;

    public KhuPho() {
    }

    public KhuPho(ArrayList<HoDan> dsHD147) {
        this.dsHD147 = dsHD147;
    }
    public void themHoDan(HoDan hs147){
        dsHD147.add(hs147);
    }
    public void nhapHoDan(Scanner sc){
        HoDan hoDan147;
        System.out.print("Nhập số hộ dân muốn thêm: ");
        int soHD147 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập thông tin cho từng hộ dân: ");
        for(int i = 1; i<= soHD147; i++){
            System.out.println("Hộ dân thứ "+i+" :");
            hoDan147 = new  HoDan();
            hoDan147.nhapThongTin(sc);
            themHoDan(hoDan147);
        }
    }
    public void hienThiDS(){
        int i =1;
        for (HoDan hd147 : dsHD147) {
            System.out.println("Hộ dân thứ " + (i++) + ":");
            hd147.hienThi();
            System.out.println("------------------");
        }
    }
    public void timKiemTT(){
        int namHT147 = LocalDate.now().getYear();
        for(HoDan hd147: dsHD147){
            for (Nguoi n147 : hd147.getDsThanhVien147()){
               int tuoi147 = namHT147 - n147.getNgaySinh147().getYear(); 
               if(tuoi147==80){
                System.out.println("Hộ dân số nhà " + hd147.getSoNha147() + " có người mừng thượng thọ:");
                n147.hienThiThongTin(); 
                System.out.println("-------------------");
               }
            }
        }
    }
}
