/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laptrinhjava;

/**
 *
 * @author huyph
 */
import java.util.Scanner;
import java.util.Arrays;
public class LapTrinhJava {
    static Scanner sc = new Scanner(System.in);
    
    static void cau2(){
        System.out.print("nhap so nguyen thu 1: ");
        int a = sc.nextInt();
        System.out.print("nhap so nguyen thu 2: ");
        int b = sc.nextInt();
        System.out.println("so vua nhap: "+a+" "+b);
        System.out.println("Tong cua hai so " + a + " + " + b + " = " + (a+b));
        System.out.println("Hieu cua hai so " + a + " - " + b + " = " + (a-b));
        System.out.println("Tich cua hai so " + a + " * " + b + " = " + (a*b));
        System.out.println("Thuong cua hai so " + a + " / " + b + " = " + (a/b));       
    }
    
    public static void cau3(){
        double PI = 3.14d;
        System.out.print("nhap ban kinh: ");
        double r = sc.nextDouble();
        System.out.println("dien tich hinh tron = "+(PI*r*r));
        System.out.println("chu vi hinh tron = "+(2*PI*r));
    }
    
    public static void cau4(){
        System.out.print("nhap chuoi so nguyen: ");
        String s = sc.nextLine();
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum = sum + (s.charAt(i)-48);
        }
        System.out.print("tong cac chu so trong chuoi = "+sum);
    }
    
    public static void cau5(){
        System.out.print("nhap so nguyen thu 1: ");
        int a = sc.nextInt();
        System.out.print("nhap so nguyen thu 2: ");
        int b = sc.nextInt();
        System.out.print("nhap so nguyen thu 3: ");
        int c = sc.nextInt();
        
        System.out.println("phan nguyen cua so thu nhat: "+(a/2));
        System.out.println("phan nguyen cua so thu hai: "+(b/2));
        System.out.println("phan nguyen cua so thu ba: "+(c/2));
        
        System.out.println("phan du cua cua so thu nhat: "+(a%3));
        System.out.println("phan du cua cua so thu hai: "+(b%3));
        System.out.println("phan du cua cua so thu ba: "+(c%3));

        System.out.println("gia tri ba so sau khi tang 1: "+(++a)+","+(++b)+","+(++c));
    }
    
    public static void cau6(){
        System.out.print("nhap so thuc a,b,c: ");
        float a=sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat();
        float x = (8*c-b)/2*a;
        System.out.println("x = "+x);
        System.out.println("x = "+(int)x);
    }
    
    static void cau7(){
        float a,b,c;
        do{
            System.out.print("nhập cạnh thứ 1: ");
            a = sc.nextFloat();
            System.out.print("nhập cạnh thứ 2: ");
            b = sc.nextFloat();
            System.out.print("nhập cạnh thứ 3: ");
            c = sc.nextFloat();
        }while(a <= 0 || b <= 0 || c <= 0 || a+b<=c || a+c<=b || b+c<=a);
        double p = (a+b+c)/2;
        double cv = a+b+c;
        double dt = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("chu vi hình tam giác = "+cv);
        System.out.println("dien tich hình tam giác = "+dt);
    }
    
    static void cau8(){
        float a,b,c;
        do{
            System.out.print("nhập cạnh thứ 1: ");
            a = sc.nextFloat();
        }while(a <= 0);
        do{
            System.out.print("nhập cạnh thứ 2: ");
            b = sc.nextFloat();
        }while(b <= 0);
        do{
            System.out.print("nhập cạnh thứ 3: ");
            c = sc.nextFloat();
        }while(c <= 0);
            
        if(a+b>=c && a+c>=b && b+c>=a){
            if(a==b && a==c)
                System.out.println("tam giác đều");
            else if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
                if(a==b || a==c || b==c)
                    System.out.println("tam giác vuông cân");
                else 
                    System.out.println("tam giác vuông");
            else if (a==b || a==c || b==c)
                System.out.println("tam giác cân");
            else 
                System.out.println("3 cạnh là tam giác thường");
        }
        else System.out.println("3 cạnh không phải là tam giác");
    }
    
    static void cau9(){
        float a,b,c,x1=0,x2=0;
            System.out.print("nhập a: ");
            a = sc.nextFloat();
            System.out.print("nhập b: ");
            b = sc.nextFloat();
            System.out.print("nhập c: ");
            c = sc.nextFloat();
        float delta = b*b - 4*a*c;
        System.out.println(delta);
        if (delta == 0){
            x2 = x1 = -(b/2*a);
        }
        else if (delta > 0){
            x1 = (float)((-b+Math.sqrt(delta)) / (a*2));
            x2 = (float)((-b-Math.sqrt(delta)) / (a*2));
        }
        else System.out.print("phuong trinh vo nghiem");
        System.out.println("x1 = " + x1);    
        System.out.println("x2 = " + x2);
    }
    
    static void cau12(){
        int thang, nam;
        System.out.print("nhap thang: ");
        
        thang = sc.nextInt();
        if (thang < 1 || thang > 12){
            System.out.println("Ban da nhap sai thang");
            return;
        }
        
        System.out.print("nhap nam: ");
        nam = sc.nextInt();
        if (nam < 0){
            System.out.println("Ban da nhap sai nam");
            return;
        }
        
        if (nam % 4 == 0)
            System.out.println("day la nam nhuan");
        else 
            System.out.println("day la nam thuong");
        
        switch (thang){
            case 1,3,5,7,8,10,12: 
                System.out.println("thang co 31 ngay");
                break;
            case 4,6,9,11:
                System.out.println("thang co 30 ngay");
                break;
            case 2:
                if (nam % 4 == 0)
                    System.out.println("thang co 29 ngay");
                else 
                    System.out.println("thang co 28 ngay");
                break;
        }
    }
    
    static void cau15(){
        int n, arr[];
        do{
            System.out.print("nhap so luong ptu: ");
            n = sc.nextByte();
        }while (n <= 0);
        arr = new int[n];
        // nhap mang
        for (int i=0; i < n; i++)
            arr[i] = sc.nextByte();
        // sap xep tang 
        Arrays.sort(arr);
        // xuat mang 
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        
    }
    
    
    public static void main(String[] args) {
        cau15();

        
    }
    
    
    
}


