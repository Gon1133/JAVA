/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jrame.onthi;    

/**
 *
 * @author huyph
 */
import java.util.Scanner;

public class Onthi {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
//        BAI1();
//        bai1 frm = new bai1();
//        frm.setVisible(true);
//        frm.setLocationRelativeTo(null); // jframe xuất hiện ở giữa màn hình
        
//        BAI2();
        bai2 frm = new bai2();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);

    }
    
    public static void BAI1(){
        int n=0;
        do {
            try{
            System.out.print("Nhap so luong nhan su: ");
            n = Integer.parseInt(sc.nextLine());
            
            }catch (Exception ex){

            }
        } while (n<=0);
        // tao danh sach nhan su
        Nhansu[] listNs = new Nhansu[n];
        for (int i=0; i<n; i++){
            System.out.println("Nhap thong tin nhan su thu "+(i+1));
            listNs[i] = new Nhansu();
            listNs[i].Nhap();
        }
        
        // xuat danh sach nhan su o Vinh Long
        System.out.println("Danh sach nhan su o Vĩnh Long:");
        for(Nhansu i: listNs){
            if (i.getQq().equalsIgnoreCase("vinh long")){
                i.Xuat();
            }
        }
        
        // thông tin của M nhân sự có lương cao nhất
        int M=0;
        do {
            try{
                System.out.print("Nhap M: ");
                M = Integer.parseInt(sc.nextLine());
                
            }catch(Exception ex){}
        } while (M<=0);
        
        // sắp xếp mảng giảm dần theo lương
        for (int i=0; i<n-1; i++){
            for (int j=i; j<n; j++){
                if (listNs[i].getLuong(500) < listNs[j].getLuong(500)){
                    Nhansu t = listNs[i];
                    listNs[i] = listNs[j];
                    listNs[j] = t;
                }
            }
        }
        // in ra M nhan su co luong cao nhat
        System.out.printf("thong tin %d nhan su co luong cao nhat:\n",M);
        for(Nhansu i: listNs){
            if (M!=0){
                i.Xuat();
                M--;
            }
        }
    }
    
    public static void BAI2(){
        int n = 0;
        do {
            System.out.print("Nhập số lượng mặt hàng: ");
            try{
                n = Integer.parseInt(sc.nextLine());
            }
            catch(Exception ex){
                System.out.println("Bạn nhập sai !");
            }
        } while (n <= 0);
        
        Mathang[] listMH = new Mathang[n];
        // nhap mang
        for (int i=0; i<n; i++){
            System.out.println("Nhập thông tin mặt hàng thứ "+(i+1));
            listMH[i] = new Mathang();
            listMH[i].Nhap();
            
        }
        // xuat mang
        for (int i=0; i<n; i++){
            System.out.println("Thông tin mặt hàng thứ "+(i+1));
            listMH[i].Xuat();
        }
        
        // mat hang co ma bat dau bang 'VN'
        System.out.println("Những mặt hàng có mã bắt đầu bằng 'VN'");
        for (Mathang i: listMH){
            if (i.getMs().startsWith("VN")){
                i.Xuat();
            }
        }
        
        // cho biết mặt hàng nào đc mua với sl nhiều nhất
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (listMH[i].getSl() < listMH[j].getSl()){
                    Mathang t = listMH[i];
                    listMH[i] = listMH[j];
                    listMH[j] = t;
                }
            }
        }
        System.out.println("mặt hàng đc mua với sl nhiều nhất: ");
        listMH[0].Xuat();
        
        
    }
    
    
    
    
}
