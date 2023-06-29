/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khoanhan;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Khoanhan {
    static Scanner sc = new Scanner(System.in);
    
    public static void Nhap(int arr[], int n){
        for (int i=0; i<n; i++){
            try {
                System.out.printf("arr[%d] = ",i);
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            catch(Exception ex){}
        }
    }
    
    public static void Xuat(int[] arr, int n){
        for (int i: arr){
            System.out.print(i+"\t");
        }
        System.out.println("");
    }
    
    public static void Cau1(){
        int n=0;
        do {
            try{
                System.out.print("Nhap so luong phan tu: ");
                n = Integer.parseInt(sc.nextLine());
            }catch(Exception ex){}
        } while (n<=0 || n >=100);
        
        int[] arr = new int[n];
        Nhap(arr,n);
        System.out.println("Mang sau khi nhap");
        Xuat(arr,n);
        
        // tinh trung binh cong
        int tong=0, d=0;
        for (int i: arr){
            tong += i;
            d++;
        }
        double tbc = tong / d;
        System.out.println("trung binh cong cac phan tu trong chuoi: "+tbc);
        
        // tinh so lan xuat hien cua cac phan tu, cho biet phan tu nao xuat hien nhieu nhat
        // Đếm số lần xuất hiện của các phần tử
        Map<Integer, Integer> countMap = new TreeMap<>();
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num)+1;
                countMap.put(num, count);
            } else {
                countMap.put(num, 1);
            }
        }
        // Tìm phần tử xuất hiện nhiều nhất
        int maxCount = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                max = num;
            }
        }
        
        System.out.println("Số lần xuất hiện của các phần tử:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            System.out.println(num + ": " + count);
        }
        
        System.out.println("Phần tử xuất hiện nhiều nhất: " + max);
        
    }
    
    
    public static void main(String[] args) {
        
        
    }
    
}
