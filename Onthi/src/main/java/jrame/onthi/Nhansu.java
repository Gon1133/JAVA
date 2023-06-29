/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jrame.onthi;

import java.util.Scanner;


public class Nhansu {
    static Scanner sc = new Scanner(System.in);
    
    private String _msns;
    private String _ht;
    private double _hsl;
    private String _qq;
    
    public Nhansu(){
        this._msns = "";
        this._ht = "";
        this._hsl = 0;
        this._qq = "";
    }
    
    public Nhansu(String msns, String ht, double hsl, String qq) {
        this._msns = msns;
        this._ht = ht;
        this._hsl = hsl;
        this._qq = qq;
    }

    /**
     * @return the _msns
     */
    public String getMsns() {
        return _msns;
    }

    /**
     * @param _msns the _msns to set
     */
    public void setMsns(String _msns) {
        this._msns = _msns;
    }

    /**
     * @return the _ht
     */
    public String getHt() {
        return _ht;
    }

    /**
     * @param _ht the _ht to set
     */
    public void setHt(String _ht) {
        this._ht = _ht;
    }

    /**
     * @return the _hsl
     */
    public double getHsl() {
        return _hsl;
    }

    /**
     * @param _hsl the _hsl to set
     */
    public void setHsl(double _hsl) {
        this._hsl = _hsl;
    }

    /**
     * @return the _qq
     */
    public String getQq() {
        return _qq;
    }

    /**
     * @param _qq the _qq to set
     */
    public void setQq(String _qq) {
        this._qq = _qq;
    }
    
    public void Nhap(){
        do {
            try{
            System.out.print("Nhap ma so nhan su: ");
            setMsns(sc.nextLine().trim().replaceAll("\\s+", " "));
            break;
        }catch (Exception ex){}
        } while (true);
        
        do {
            try{
            System.out.print("Nhap ho ten: ");
            setHt(sc.nextLine().trim().replaceAll("\\s+", " "));
            break;
            }catch (Exception ex){        }
        } while (true);

        do {
            try{
            System.out.print("Nhap he so luong: ");
            setHsl(Double.parseDouble(sc.nextLine()));
            }catch (Exception ex){        }
        } while (getHsl()<=0);
        
        do {
            try{
            System.out.print("Nhap noi sinh: ");
            setQq(sc.nextLine().trim().replaceAll("\\s+", " "));
            break;
            }catch (Exception ex){        }
        } while (true);
        
        
        
    }
    
    public void Xuat(){
        System.out.println("Ma so: " + getMsns());
        System.out.println("Ho ten: "+getHt());
        System.out.println("He so luong: "+getHsl());
        System.out.println("Noi sinh: "+getQq());
        
    }
    
    public double getLuong(double pc){
        return getHsl()+1150+pc;
        
    }
    
    
    
    
    
    
}
