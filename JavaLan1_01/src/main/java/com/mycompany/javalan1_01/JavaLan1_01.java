/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalan1_01;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.List;
public class JavaLan1_01 {
    static Scanner sc = new Scanner(System.in);
    
//    Thông báo người dùng nhập chuỗi số thực có từ n đến m phần tử.
//    Các phần tử cách nhau dấu ;
//    Thực hiện chuyển các phần tử nhập đúng yêu cầu sang mảng số thực.
//    Cho biết các phần tử không phải là số thực.
    public static void Cau1(){
        int n=0,m=0;
        do {
            try{
                System.out.print("Nhap n: ");
                n = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap m: ");
                m = Integer.parseInt(sc.nextLine());
            }catch(Exception ex){
                System.out.println("Ban nhap sai!");
            }
        } while (n<=0 || m<=0 || n>=m);
        boolean flag = false;
        do {
            System.out.printf("Nhap chuoi so thuc tu {0} den {1} phan tu: ",n,m);
            String chuoi = sc.nextLine().trim();
            String[] mang = chuoi.split(";");
            if (mang.length < n || mang.length > m)
                flag = false;
            else flag = true;
            
        } while (flag==false);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        //Cau1();
        int n=0;
        do {
            try{
                System.out.print("Nhap so luong hang hoa: ");
                n = Integer.parseInt(sc.nextLine());
            }catch(Exception ex){}
        } while (n<=0);
        // nhap
        Hanghoa[] listhh= new Hanghoa[n]; 
        for (int i=0; i<n; i++){
            System.out.println("Nhap hang hoa thu "+(i+1));
            listhh[i] = new Hanghoa();
            listhh[i].Nhap();
        }
        
        //tang gia
        for(int i=0; i<n; i++){
            if (listhh[i].getTenhh().compareToIgnoreCase("mi hao hao") == 0){
                listhh[i].setGiaban(listhh[i].getGiaban()+listhh[i].getGiaban()*20/100);
            }
        }
        // sap xep giam
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (listhh[i].getGiaban() < listhh[j].getGiaban()){
                    Hanghoa t = listhh[i];
                    listhh[i] = listhh[j];
                    listhh[j] = t;
                }
        // in 10 hh max
        System.out.println("10 hang hoa mat nhat:");
        try{
            for (int i=0; i<10; i++){
            listhh[i].Xuat();
            }
        }catch(Exception ex){
            System.out.println("Khong du 10 mat hang.");
        }
    }
    
    
}
