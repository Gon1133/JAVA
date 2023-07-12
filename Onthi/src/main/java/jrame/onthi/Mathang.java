/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jrame.onthi;

import java.util.Scanner;

/**
 *
 * @author huyph
 */
public class Mathang {
    private String ms;
    private String tmh;
    private int sl;
    private double gb;
    private String nsx;
    
    public Mathang(){
        this.ms = "";
        this.tmh = "";
        this.sl = -1;
        this.gb = -1;
        this.nsx = ""; 
    }

    public Mathang(String ms, String tmh, int sl, double gb, String nsx) {
        this.ms = ms;
        this.tmh = tmh;
        this.sl = sl;
        this.gb = gb;
        this.nsx = nsx;
    }

    /**
     * @return the ms
     */
    public String getMs() {
        return ms;
    }

    /**
     * @param ms the ms to set
     */
    public void setMs(String ms) {
        this.ms = ms;
    }

    /**
     * @return the tmh
     */
    public String getTmh() {
        return tmh;
    }

    /**
     * @param tmh the tmh to set
     */
    public void setTmh(String tmh) {
        this.tmh = tmh;
    }

    /**
     * @return the sl
     */
    public int getSl() {
        return sl;
    }

    /**
     * @param sl the sl to set
     */
    public void setSl(int sl) {
        this.sl = sl;
    }

    /**
     * @return the gb
     */
    public double getGb() {
        return gb;
    }

    /**
     * @param gb the gb to set
     */
    public void setGb(double gb) {
        this.gb = gb;
    }

    /**
     * @return the nsx
     */
    public String getNsx() {
        return nsx;
    }

    /**
     * @param nsx the nsx to set
     */
    public void setNsx(String nsx) {
        this.nsx = nsx;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Nhập mã số mặt hàng: ");
            setMs(sc.nextLine().replaceAll("\\s++", "").trim());
            
        } while (getMs().isEmpty());
        
        do {
            System.out.print("Nhập tên mặt hàng: ");
            setTmh(sc.nextLine().replaceAll("\\s+", "").trim());
            
        } while (getTmh().isEmpty());
        
        do {
            System.out.print("Nhập số lượng: ");
            try{
                setSl(Integer.parseInt(sc.nextLine()));
                
            }
            catch(Exception ex){
                System.out.println("bạn nhập sai!");
            }
        } while (getSl() <= 0);
        
        do {
            System.out.print("Nhập giá bán: ");
            try{
                setGb(Double.parseDouble(sc.nextLine()));
            }
            catch(Exception ex){
                System.out.println("Bạn nhập sai !");
            }
        } while (getGb() <= 0);
        
        do {
            System.out.print("Nhập nhà sản xuất: ");
            setNsx(sc.nextLine().replaceAll("\\s+", "").trim());
            
        } while (getNsx().isEmpty());
    }
    
    public void Xuat(){
        System.out.println("Mã số: "+getMs());
        System.out.println("Tên mặt hàng: "+getTmh());
        System.out.println("Số lượng: "+getSl());
        System.out.println("Giá bán: "+getGb());
        System.out.println("Nhà sản xuất: "+getNsx());
    }
    
    public double getThanhtien(){
        return getSl() * getGb();
    }
    
}
