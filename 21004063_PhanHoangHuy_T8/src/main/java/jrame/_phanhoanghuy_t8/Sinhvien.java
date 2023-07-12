/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jrame._phanhoanghuy_t8;

import java.time.LocalDate;


/**
 *
 * @author huyph
 */
public class Sinhvien {
    private String _mssv;
    private String _ht;
    private LocalDate _ns;
    private double _dtb;
    private String _lop;

    /**
     * @return the _mssv
     */
    public String getMssv() {
        return _mssv;
    }

    /**
     * @param _mssv the _mssv to set
     */
    public void setMssv(String _mssv) {
        this._mssv = _mssv;
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
     * @return the _ns
     */
    public LocalDate getNs() {
        return _ns;
    }

    /**
     * @param _ns the _ns to set
     */
    public void setNs(LocalDate _ns) {
        this._ns = _ns;
    }

    /**
     * @return the _dtb
     */
    public double getDtb() {
        return _dtb;
    }

    /**
     * @param _dtb the _dtb to set
     */
    public void setDtb(double _dtb) {
        this._dtb = _dtb;
    }

    /**
     * @return the _lop
     */
    public String getLop() {
        return _lop;
    }

    /**
     * @param _lop the _lop to set
     */
    public void setLop(String _lop) {
        this._lop = _lop;
    }

    public Sinhvien(String _mssv, String _ht, LocalDate _ns, double _dtb, String _lop) {
        this._mssv = _mssv;
        this._ht = _ht;
        this._ns = _ns;
        this._dtb = _dtb;
        this._lop = _lop;
    }
    
    public Sinhvien(){
        this._mssv = "";
        this._ht = "";
        this._ns = LocalDate.now();
        this._dtb = -1;
        this._lop = "";
    }
    
    public String getXepLoai(){
        if (getDtb() >= 8.5)
            return "Giỏi";
        else if (getDtb() >= 6.5 && getDtb() < 8.5)
            return "Khá";
        else if (getDtb() >= 5 && getDtb() < 6.5)
            return "Trung bình";
        else return "Kém";
        
    }
    
    public int getTuoi(){
        return LocalDate.now().getYear() - getNs().getYear();
        
    }
    
    
}
