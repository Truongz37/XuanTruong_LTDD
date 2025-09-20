/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLySach {
    private ArrayList<TaiLieu> dstl147;

    public QuanLySach() {
        dstl147 = new ArrayList<TaiLieu>(10);
    }
    public void themTaiLieu(TaiLieu tl147){
        dstl147.add(tl147);
    }
    public void nhapDSTL(Scanner sc){
        int chon147; 
        String stop147;
        TaiLieu tl147;
        do {            
            System.out.println("Chọn loại tài liệu: 1.Sách; 2.Tạp chí; 3.Báo");
            chon147 = sc.nextInt();
            sc.nextLine();
            switch (chon147) {
                case 1:
                    tl147 = new Sach();
                    break;
                case 2:
                    tl147 = new TapChi();
                    break;
                case 3:
                    tl147 = new Bao();
                    break;
                default:
                    throw new AssertionError();
            }
            tl147.nhapThongTin(sc);
            themTaiLieu(tl147);
            System.out.println("Bạn có muốn nhập tiếp tục không(Có: c, Không: k)? ");
            stop147 = sc.nextLine();
        } while (stop147.equals("c"));
    }
    public void timMaTL(String maTL147){
        for(TaiLieu TL147: dstl147){
            if(maTL147.equals(TL147)){
                TL147.hienThiThongTin();
            }
        } 
    }
    public void timLoaiTL(String loaiTL147){
        for(TaiLieu TL147: dstl147){
            if(loaiTL147.equals("Sách")&&(TL147 instanceof Sach)){
                TL147.hienThiThongTin();
            }
            else if (loaiTL147.equals("Tạp chí")&&(TL147 instanceof TapChi)) {
                TL147.hienThiThongTin();
            }
            else
               TL147.hienThiThongTin(); 
        } 
    }
}
