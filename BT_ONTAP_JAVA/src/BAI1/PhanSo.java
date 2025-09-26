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
public class PhanSo {
    //thuộc tính
    private int tuSo147;
    private int mauSo147;
    //phương thức
    //hàm khởi tạo không đối
    public PhanSo(){
        tuSo147 =0;
        mauSo147 =1;
    }
    //hàm khởi tạo có đối

    public PhanSo(int tuSo147, int mauSo147) {
        this.tuSo147 = tuSo147;
        this.mauSo147 = mauSo147;
    }
    //nhập
    public void nhapPS(Scanner sc){
        int a147;
        int b147;
        do {
            System.out.print("\tNhập tử số: ");
            a147 = sc.nextInt();
            System.out.print("\tNhập mẫu số: ");
            b147 = sc.nextInt();
            if(b147 ==0)
            {
                System.out.print("Mẫu số không được bằng 0, vui lòng nhập lại !!!");
            }
            else{
                tuSo147 = a147;
                mauSo147 =b147;
            }
        } while (b147==0);
    }
    //xuất
    public void xuatPS(){
        if(tuSo147*mauSo147 <0){
            System.out.println("\t-" + Math.abs(tuSo147) +"/" + Math.abs(mauSo147));
        }
        else{
            System.out.println("\t" + Math.abs(tuSo147) +"/" + Math.abs(mauSo147));
        }    
    }
    //cộng phân số
    public PhanSo congPS(PhanSo ps2){
        int a147 = tuSo147*ps2.mauSo147 + ps2.tuSo147*mauSo147;
        int b147 = mauSo147 * ps2.mauSo147;
        
        return new PhanSo(a147,b147);
    }
    //trừ phân số
    public PhanSo truPS(PhanSo ps2){
        int a147 = tuSo147*ps2.mauSo147 - ps2.tuSo147*mauSo147;
        int b147 = mauSo147 * ps2.mauSo147;
        
        return new PhanSo(a147,b147);
    }
    //nhân phân số
    public PhanSo nhanPS(PhanSo ps2){
        int a147 = tuSo147* ps2.tuSo147;
        int b147 = mauSo147 * ps2.mauSo147;
        
        return new PhanSo(a147,b147);
    }
    //chia phân số
    public PhanSo chiaPS(PhanSo ps2){
        int a147 = tuSo147* ps2.mauSo147;
        int b147 = mauSo147 * ps2.tuSo147;
        
        return new PhanSo(a147,b147);
    }
    //tìm UCLN
    private int timUCLN(int a147, int b147){
        int r147 =a147%b147;
        while(r147!=0)
        {
            a147=b147;
            b147=r147;
            r147=a147%b147;
        }
        return b147;
    }
    //kiểm tra tối giản
    public boolean kiemTraToiGian(){
        if(timUCLN(tuSo147, mauSo147)==1){
            return true;
        }
        else 
            return false;
    }
    //hàm tối giản phân số
    public void toiGianPhanSo(){
        int x147 = timUCLN(tuSo147, mauSo147);
        tuSo147/=x147;
        mauSo147/=x147;
    }

    public int getTuSo147() {
        return tuSo147;
    }

    public void setTuSo147(int tuSo147) {
        this.tuSo147 = tuSo147;
    }

    public int getMauSo147() {
        return mauSo147;
    }

    public void setMauSo147(int mauSo147) {
        this.mauSo147 = mauSo147;
    }
}
