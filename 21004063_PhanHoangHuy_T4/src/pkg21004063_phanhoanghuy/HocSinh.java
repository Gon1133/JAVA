/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg21004063_phanhoanghuy;

/**
 *
 * @author huyph
 */
import java.util.Scanner;
public class HocSinh {
    static Scanner sc = new Scanner(System.in);
    // fied 
    private String _mshs;
    private String _hoten;
    private String _lop;
    private double _dtb;

    public void setMshs(String _mshs) {
        this._mshs = _mshs;
    }

    public void setHoten(String _hoten) {
        this._hoten = _hoten;
    }

    public void setLop(String _lop) {
        this._lop = _lop;
    }

    public void setDtb(double _dtb) {
        this._dtb = _dtb;
    }

    public String getMshs() {
        return _mshs;
    }

    public String getHoten() {
        return _hoten;
    }

    public String getLop() {
        return _lop;
    }

    public double getDtb() {
        return _dtb;
    }
    
    // Constructor

    public HocSinh(String _mshs, String _hoten, String _lop, double _dtb) {
        this._mshs = _mshs;
        this._hoten = _hoten;
        this._lop = _lop;
        this._dtb = _dtb;
    }

    public HocSinh() {
        this._mshs = "";
        this._hoten = "";
        this._lop = "";
        this._dtb = -1;
    }
    
    // Method
    public void Nhap(){
        do {
            try{
                System.out.print("Nhập mã số học sinh: ");
                setMshs(sc.nextLine().trim().replaceAll("\\s+"," "));
        }
            catch (Exception ex){
                System.out.println("bạn nhập sai!");
            }
        } while (getMshs().isEmpty());
        
        do {
            try{
                System.out.print("Nhập họ tên: ");
                setHoten(sc.nextLine().trim().replaceAll("\\s+", " "));
        }
            catch (Exception ex){
                System.out.println("bạn nhập sai!");
            }
        } while (getHoten().isEmpty());
        
        do {
            try{
                System.out.print("Nhập lớp: ");
                setLop(sc.nextLine().trim().replaceAll("\\s+", " "));
        }
            catch (Exception ex){
                System.out.println("bạn nhập sai!");
            }
        } while (getLop().isEmpty());
        
        
        do {
            try{
                System.out.print("Nhập điểm trung bình: ");
                setDtb(Double.parseDouble(sc.nextLine()));
        }
            catch (Exception ex){
                System.out.println("bạn nhập sai!");
            }
        } while (getDtb() < 0 || getDtb() > 10);
    }
    
    public void Xuat(){
        System.out.println("Mã số học sinh: "+getMshs());
        System.out.println("Họ tên: "+getHoten());
        System.out.println("Lớp: "+getLop());
        System.out.println("Điểm trung bình: "+getDtb());
    }
    
    public void XepLoai(){
        if (this._dtb >= 9)
            System.out.println("xuat sac");
        else if (this._dtb >= 8 )
            System.out.println("gioi");
        else if (this._dtb >= 7 )
            System.out.println("kha");
        else if (this._dtb >= 5 )
            System.out.println("trung binh");
        else System.out.println("kém");
    }
    
}

   