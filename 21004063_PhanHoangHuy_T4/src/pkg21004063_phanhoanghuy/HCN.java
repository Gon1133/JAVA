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
public class HCN {
    static Scanner sc = new Scanner(System.in);
    // FIED
    private double _cd;
    private double _cr;
    
    public double getCd(){
        return _cd;
    }
    public void setCd(double cd){
        this._cd = cd;
    }
    public double getCr(){
        return _cr;
    }
    public void setCr(double cr){
        this._cr = cr;
    }
    
    
    public double getCV(){
        return (this._cd + this._cr)*2;
    }
    
    public double getDT(){
        return this._cd * this._cr;
    }
    // CONSTRUCTOR
    public HCN(double cd, double cr){
        this._cd = cd;
        this._cr = cr;
    }
    
    public HCN (){
        this._cd = 1;
        this._cr = 1;
    }
    
    // METHOD / PROPERTIES
    public void Nhap(){
        do {
            try{
            System.out.print("nhap cd: ");
            this.setCd(Double.parseDouble(sc.nextLine()));
            break;
            }
            catch(Exception ex){
                System.out.print("nhap sai !");
            }
        } while (true);
        
        do {
            try{
            System.out.print("nhap cr: ");
            this.setCr(Double.parseDouble(sc.nextLine()));
            break;
            }
            catch(Exception ex){
                System.out.print("nhap sai !");
            }
        } while (true);
    }
    
    public void Xuat(){
        System.out.println("cd = "+getCd());
        System.out.println("cr = "+getCr());
        System.out.println("cv = "+getCV());
        System.out.println("dt = "+getDT());
    }
    
    
    
}
