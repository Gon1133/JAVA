/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalan1_01;

//Các thuộc tính: Mã hàng hóa, tên hàng hóa, Giá bán, ngày nhập.
//Các phương thức:
//- Hàm tạo có đối số.
//- set<thuộc tính>, get<thuộc tính>
//- Nhập: Nhập các thuộc tính cho hàng hóa. Riêng Mã hàng phải nhận đủ 4 ký tự; 2 ký tự đầu là chữ cái, 2 ký tự sau là chữ số. Ngày nhập không được trước ngày hiện tại.
//- Xuất: In các giá trị của thuộc tính trên cùng 1 dòng.
//Minh họa việc sử lớp hàng hóa.
//-	Nhập n hàng hóa.
//-	Tăng giá cho mặt hàng Mì Hảo Hảo nhập trong tháng này thêm 20%.
//-	In 10 mặt hàng đắt nhất.

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class Hanghoa {
    static Scanner sc = new Scanner(System.in);
    
    private String _mahh;
    private String _tenhh;
    private long _giaban;
    private String _ngaynhap;

    /**
     * @return the _mahh
     */
    public String getMahh() {
        return _mahh;
    }

    /**
     * @param _mahh the _mahh to set
     */
    public void setMahh(String _mahh) {
        this._mahh = _mahh;
    }

    /**
     * @return the _tenhh
     */
    public String getTenhh() {
        return _tenhh;
    }

    /**
     * @param _tenhh the _tenhh to set
     */
    public void setTenhh(String _tenhh) {
        this._tenhh = _tenhh;
    }

    /**
     * @return the _giaban
     */
    public long getGiaban() {
        return _giaban;
    }

    /**
     * @param _giaban the _giaban to set
     */
    public void setGiaban(long _giaban) {
        this._giaban = _giaban;
    }

    /**
     * @return the _ngaynhap
     */
    public String getNgaynhap() {
        return _ngaynhap;
    }

    /**
     * @param _ngaynhap the _ngaynhap to set
     */
    public void setNgaynhap(String _ngaynhap) {
        this._ngaynhap = _ngaynhap;
    }
    
    public Hanghoa(){
        this._giaban = 0;
        this._mahh = "";
        this._ngaynhap = "";
        this._tenhh = "";
    }
    public Hanghoa(String mahh, String tenhh, long gb, String ngay){
        this._giaban = gb;
        this._mahh = mahh;
        this._ngaynhap = ngay;
        this._tenhh = tenhh;
    }
    
    public void Nhap(){
        boolean flag = false;
        
        do {
            try{
                System.out.print("Nhap ma hang hoa: ");
                setMahh(sc.nextLine().trim());
                
            }
            catch (Exception ex){}
        } while (getMahh().length() != 4 || !Character.isLetter(getMahh().charAt(0)) || !Character.isLetter(getMahh().charAt(1)) || !Character.isDigit(getMahh().charAt(2)) || !Character.isDigit(getMahh().charAt(3)));
        
        do {
            try{
                System.out.print("Nhap ten hang hoa: ");
                setTenhh(sc.nextLine());
            }
            catch(Exception ex){}
        } while (getTenhh().isEmpty());
        
        do {
            try{
                System.out.print("Nhap gia ban: ");
                setGiaban(Long.parseLong(sc.nextLine()));
            }
            catch(Exception ex){}
        } while (getGiaban() <= 0);
        
        
        do {
            try{
                System.out.print("Nhap ngay nhap (dd/MM/yyyy): ");
                setNgaynhap(sc.nextLine());
                String[] ngaynhap = getNgaynhap().split("/");
                int ngay = Integer.parseInt(ngaynhap[0]);
                int thang = Integer.parseInt(ngaynhap[1]);
                int nam = Integer.parseInt(ngaynhap[2]);
                LocalDate Ngaynhap = LocalDate.of(nam, thang, ngay);
                LocalDate Hientai = LocalDate.now();
                if (Ngaynhap.isAfter(Hientai))
                    flag = false;
                else flag = true;
            }
            catch(Exception ex){}
        } while (getNgaynhap().isEmpty() || flag == false);
        
        
    }
    public void Xuat(){
            System.out.println("Mã hàng hóa: "+getMahh()+"\t Tên hàng hóa: "+getTenhh()+"\t Giá bán: "+getGiaban()+"\t Ngày nhập: "+getNgaynhap()+"\n");
    }
    
}
