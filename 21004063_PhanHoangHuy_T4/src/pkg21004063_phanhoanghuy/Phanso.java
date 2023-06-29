/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg21004063_phanhoanghuy;

/**
 *
 * @author PC02
 */
import java.util.Scanner;
public class Phanso {
    static Scanner sc = new Scanner(System.in);
    // FIED
    private int _tuso;
    private int _mauso;
    
    public int getTu(){return this._tuso;}
    public void setTu(int t)
    {this._tuso = t;}
    
    public int getMau(){return this._mauso;}
    public void setMau(int m)
    {this._mauso = m;}
    
    // CONSTRUCTOR
    public Phanso(int t, int m){
        this._mauso=m;
        this._tuso=t;
    }
    public Phanso(){
        this._mauso=1;
        this._tuso=1;
    }
    public void Nhap(){
        do {
            try{
                System.out.print("Nhap tu so: ");
                this.setTu(Integer.parseInt(sc.nextLine()));
            }
            catch (Exception ex){
                System.out.println("nhap sai !");
            }
        } while (this.getTu()==0);
        
        do {
            try{
                System.out.print("Nhap mau so: ");
                this.setMau(Integer.parseInt(sc.nextLine()));
            }
            catch (Exception ex){
                System.out.println("nhap sai !");
            }
        } while (this.getMau()==0);
        
    }
    
    public void Xuat(){
        System.out.printf("%d/%d\n",getTu(),getMau());
    }
    
    
    public void getCong(Phanso ps2){
        int tu,mau;
        if (this.getMau() == ps2.getMau()){
            tu = this.getTu() + ps2.getTu();
            mau = this.getMau();
        }
        else{
            tu = this.getTu()*ps2.getMau() + this.getMau()*ps2.getTu();
            mau = this.getTu()*this.getMau();
        }
        Phanso ps1 = new Phanso(tu,mau);
        ps1.Xuat();
    }
    
    public void getTru(Phanso ps2){
        int tu,mau;
        if (this.getMau() == ps2.getMau()){
            tu = this.getTu() - ps2.getTu();
            mau = this.getMau();
        }
        else{
            tu = this.getTu()*ps2.getMau() - this.getMau()*ps2.getTu();
            mau = this.getTu()*this.getMau();
        }
        Phanso ps1 = new Phanso(tu,mau);
        ps1.Xuat();
    }
    
    public void getNhan(Phanso ps2){
        int tu,mau;
        
        tu = this.getTu() * ps2.getTu();
        mau = this.getMau()*ps2.getMau();
        
        Phanso ps1 = new Phanso(tu,mau);
        ps1.Xuat();
    }
    
    public void getChia(Phanso ps2){
        int tu,mau;
        
        tu = this.getTu() * ps2.getMau();
        mau = this.getMau() * ps2.getTu();
        
        Phanso ps1 = new Phanso(tu,mau);
        ps1.Xuat();
    }
    
    // Main
    public static void Cong(Phanso ps1, Phanso ps2){
        int tu,mau;
        if (ps1.getMau() == ps2.getMau()){
            tu = ps1.getTu() + ps2.getTu();
            mau = ps1.getMau();
        }
        else{
            tu = ps1.getTu()*ps2.getMau() + ps1.getMau()*ps2.getTu();
            mau = ps1.getTu()*ps1.getMau();
        }
        Phanso ps = new Phanso(tu,mau);
        ps1.Xuat();
    }
    
    public static void psMax(Phanso ps1, Phanso ps2){
        ps1.setTu(ps1.getTu() * ps2.getMau());
        ps1.setMau(ps1.getMau() * ps2.getMau());
        ps2.setTu(ps2.getTu() * ps1.getMau());
        ps2.setMau(ps1.getMau() * ps2.getMau());
        if (ps1.getTu()>ps2.getTu())
            System.out.println("ps1 lon hon ps2");
        else System.out.println("ps1 nho hon ps2");
    }
    
}
