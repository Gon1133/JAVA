/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21004063_phanhoanghuy;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
//        HocSinh hs1 = new HocSinh();
//        HocSinh hs2 = new HocSinh();
//        System.out.println("Nhập thông tin học sinh thứ 1:");
//        hs1.Nhap();
//        System.out.println("Nhập thông tin học sinh thứ 2:");
//        hs2.Nhap();
//        
//        System.out.println("người có điểm tb cao hơn là: ");
//        if (hs1.getDtb() > hs2.getDtb())
//            hs1.Xuat();
//        else hs2.Xuat();
        
        int n=0;
        do {
            try{
                System.out.print("Nhập số lượng học sinh: ");
                n = Integer.parseInt(sc.nextLine());
            }
            catch(Exception ex){
                System.out.println("không đc nhập chữ!");
            }
        } while (n<=0);
        HocSinh[] listHS = new HocSinh[n];
        // nhập ds
        for (int i=0; i<n; i++){
            System.out.println("Nhập thông tin học sinh thứ "+(i+1));
            listHS[i] = new HocSinh();
            listHS[i].Nhap();
        }
        // xuất ds
        for (int i=0; i<n; i++){
            System.out.println("Thông tin học sinh thứ "+(i+1));
            listHS[i].Xuat();
        }
        
// xuat ds cua hoc sinh lop "8A6"
//        System.out.println("danh sách học sinh lớp 8A6");
//        for (int i=0; i<n; i++){
//            if (listHS[i].getLop().compareToIgnoreCase("8a6")==0)
//                listHS[i].Xuat();
//        }

// xuat ds hoc sinh tang dan theo ten
//        HocSinh listTen[] = listHS;
//        System.out.println("\ndanh sách học sinh được sắp xếp theo tên:");
//        String[] tenHS = new String[n];
//        for (int i=0; i<n; i++){
//            String[] ten = listHS[i].getHoten().split(" ");
//            for (int j=ten.length-1; j>=0; j--){
//                tenHS[i] = ten[j];
//                break;
//            }
//        }
//        for (String i: tenHS)
//            System.out.println(i);
//        
//        for (int i=0; i<n-1; i++){
//            for (int j=i+1; j<n; j++){
//                // xet theo ma ascii roi tru (huy va nguyen -> -7)
//                if (tenHS[i].compareToIgnoreCase(tenHS[j]) > 0){
//                    HocSinh temp = listTen[i];
//                    listTen[i] = listTen[j];
//                    listTen[j] = temp;
//                    String t = tenHS[i];
//                    tenHS[i] = tenHS[j];
//                    tenHS[j] = t;
//                }
//            }
//        }
//        for (int i=0; i<n; i++){
//            System.out.println("Thông tin học sinh thứ "+(i+1));
//            listTen[i].Xuat();
//        }

// Xuất danh sách học sinh theo từng lớp.
//        HocSinh listLop[] = listHS;
//        System.out.println("\ndanh sach hoc sinh theo lop:");
//        for (int i=0; i<n-1; i++)
//            for (int j=i; j<n; j++)
//                if (listLop[i].getLop().compareToIgnoreCase(listLop[j].getLop()) > 0){
//                    HocSinh t = listLop[i];
//                    listLop[i] = listLop[j];
//                    listLop[j] = t;
//                }
//        
//        for (HocSinh i: listLop){
//            i.Xuat();
//        }

// Sắp xếp danh sách giảm dần theo điểm trung bình
//        HocSinh listDtb[] = listHS;
//        System.out.println("\ndanh sach hoc sinh theo diem trung binh:");
//        for (int i=0; i<n-1; i++)
//            for (int j=i+1; j<n; j++)
//                if (listDtb[i].getDtb() < listDtb[j].getDtb()){
//                    HocSinh t = listDtb[i];
//                    listDtb[i] = listDtb[j];
//                    listDtb[j] = t;
//                }
//        for (HocSinh i: listDtb){
//            i.Xuat();
//        }

// Xếp hạng cho học sinh theo các lớp.
        ArrayList<String> Lop = new ArrayList<String>();
        
        HocSinh listLop[] = listHS;
        System.out.println("\ndanh sach hoc sinh theo lop:");
        
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (listLop[i].getLop().compareToIgnoreCase(listLop[j].getLop()) > 0){
                    HocSinh t = listLop[i];
                    listLop[i] = listLop[j];
                    listLop[j] = t;
                }

        for (int i=0; i<=n-2; i++)
            for (int j=i+1; j<=n-1; j++)
                if (listLop[i].getLop().compareToIgnoreCase(listLop[j].getLop()) == 0 && listLop[i].getDtb() < listLop[j].getDtb()){
                    HocSinh t = listLop[i];
                    listLop[i] = listLop[j];
                    listLop[j] = t;
                }
        for (HocSinh i: listLop){
            i.Xuat();
        }
        
        
        
        
        
        
    }
}
