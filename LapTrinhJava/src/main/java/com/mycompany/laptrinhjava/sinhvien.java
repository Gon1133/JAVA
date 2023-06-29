/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava;

/**
 *
 * @author huyph
 */
public class sinhvien {
    private String _st;
    private int _tuoi;
    private String _mssv;
    private double _dtb;

    @Override
    public String toString() {
        return "sinhvien{" + "_st=" + _st + ", _tuoi=" + _tuoi + ", _mssv=" + _mssv + ", _dtb=" + _dtb + '}';
    }

    public String getSt() {
        return _st;
    }

    public int getTuoi() {
        return _tuoi;
    }

    public String getMssv() {
        return _mssv;
    }

    public double getDtb() {
        return _dtb;
    }

    public void setSt(String _st) {
        this._st = _st;
    }

    public void setTuoi(int _tuoi) {
        this._tuoi = _tuoi;
    }

    public void setMssv(String _mssv) {
        this._mssv = _mssv;
    }

    public void setDtb(double _dtb) {
        this._dtb = _dtb;
    }

    public sinhvien(String st, int tuoi, String mssv, double dtb) {
        this._st = st;
        this._tuoi = tuoi;
        this._mssv = mssv;
        this._dtb = dtb;
    }

    
    
    
}
