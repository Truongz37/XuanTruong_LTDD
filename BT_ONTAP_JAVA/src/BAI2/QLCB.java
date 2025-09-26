/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import java.util.ArrayList;
import java.util.Scanner;
        
/**
 *
 * @author Admin
 */
public class QLCB {
    private ArrayList<CanBo> dscb147;
    public QLCB(){
        dscb147 = new ArrayList<CanBo>(10);
    }
    public void themCanBo(CanBo cb147){
        dscb147.add(cb147);
    }
    public void nhapDanhSach(Scanner sc){
        CanBo cb147;
        System.out.print("Nhập số lượng cán bộ: ");
        int n147 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập thông tin chi tiết: ");
        for(int i147 =1; i147<=n147;i147++)
        {
            System.out.println("Cán bộ thứ " +i147+" :");
            System.out.println("Chọn loại cán bộ (1.Kỹ sư; 2.Nhân viên; 3.Công nhân): ");
           int chon147 = sc.nextInt();
           sc.nextLine();
           cb147=new  CanBo(); //tính đa hình
           switch(chon147)
           {
               case 1:
                   cb147 = new  KySu();
                   break;
               case 2:
                   cb147 = new NhanVien();
                   break;
               case 3:
                   cb147 = new CongNhan();
                   break;
               default:
                   cb147 = new KySu();
                   break;
           }
           cb147.nhapThongTin(sc);
           dscb147.add(cb147);
        }
    }
    public void timKiemCanBo(String hoTen){
        for(CanBo cb147 : dscb147)
        {
            if(hoTen.equals(cb147.getHoTen())){
                cb147.hienThiThongTin();
            }
        }
    }
}
