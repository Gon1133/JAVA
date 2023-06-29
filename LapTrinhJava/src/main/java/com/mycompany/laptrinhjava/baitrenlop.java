package com.mycompany.laptrinhjava;
import java.util.Scanner;
public class baitrenlop {
    static Scanner sc = new Scanner(System.in);
    
    static void InThuTrongTuan(){
        System.out.print("Nhập số nguyên: ");
        int a = sc.nextInt();
        String thu;
        /*switch (a){
            case 2: System.out.println("thứ hai"); break;
            case 3: System.out.println("thứ ba"); break;
            case 4: System.out.println("thứ tư"); break;
            case 5: System.out.println("thứ năm"); break;
            case 6: System.out.println("thứ sáu"); break;
            case 7: System.out.println("thứ bảy"); break;
            case 8: System.out.println("chủ nhật"); break;
            default: System.out.println("bạn nhập sai");
        }*/
        switch (a){
            case 2: thu = "thứ hai"; break;
            case 3: thu = "thứ ba"; break;
            case 4: thu = "thứ tư"; break;
            case 5: thu = "thứ năm"; break;
            case 6: thu = "thứ sáu"; break;
            case 7: thu = "thứ bảy"; break;
            case 8: thu = "chủ nhật"; break;
            default:  thu = "bạn nhập sai";
        }
        System.out.println(thu);
    }
    
    static void CvDtHT(){
        float r;
        do{
            System.out.print("nhập bán kính: ");
            r = sc.nextFloat();
        }while(r <= 0);
        double cv = r*2*3.14;
        double dt = r*r*3.14;
        System.out.println("chu vi hình tròn = "+cv);
        System.out.println("dien tich hình tròn = "+dt);
    }
    
    static void CvDtHCN(){
        float cd, cr;
        do{
            System.out.print("nhập chiều dài: ");
            cd = sc.nextFloat();
            System.out.print("nhập chiều rộng: ");
            cr = sc.nextFloat();
        }while(cd <= 0 || cr <= 0);
        double cv = 2*(cd+cr);
        double dt = cd*cr;
        System.out.println("chu vi hình chử nhật = "+cv);
        System.out.println("dien tich hình chử nhật = "+dt);
    }
    
    static void CvDtTG(){
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
    
    
    static void luachon(){
        int n;
        do{
            System.out.print("nhập số thứ tự công việc: ");
            n = sc.nextInt();
        }while(n <= 0 || n > 3 );

        switch(n){
            case 1 -> CvDtHT();
            case 2 -> CvDtHCN();
            case 3 -> CvDtTG();
        }
        
    }
    
    // kiem tra so ngto
    static boolean KTNgTo(int n){
        if (n<=1) 
            return false;
        for (int i=2; i <= Math.sqrt(n); i++)
            if (n%i==0)
                return false;
        return true;
    }
    
    // nhap so ngto
    static int NhapNgto(){
        int n;
        do{
            System.out.print("Nhap so nguyen to: ");
            n = sc.nextInt();
        }while (!KTNgTo(n));
        return n;
    }
    
    // nhap lien tuc so nguyen. dung khi nhap ko phai so nguyen. tinh tong cac so ngto vua nhap
    static int NhapLT(){
        int n, S=0;
        do{
            System.out.print("Nhap so nguyen: ");
            try{
                n = sc.nextInt();
            }
            catch(Exception ex){
                break;
            }                   
            if(KTNgTo(n))
                S = S+n;
        }while(true);
        return S;
    }
    
    //in tat ca hoan vi cua n
    static void InHV(){
        String n;
        System.out.print("Nhap n: ");
        n = sc.next();
        //System.out.print(n);
    }
    
    public static void inHoanVi(String temp, String n) {
    if (n.length() == 0) {
        System.out.println(temp);
    } else {
        for (int i = 0; i < n.length(); i++) {
            String newPrefix = temp + n.charAt(i);
            String newRemaining = n.substring(0, i) + n.substring(i + 1);
            inHoanVi(newPrefix, newRemaining);
            }
        }
    }
    
    // mang 1 chieu chua n so chinh phuong dau tien
    static void nSoCP(){
        int n;
        do{
            System.out.print("nhap n so CP dau tien: ");
            n=sc.nextInt();
        }while(n<=0);
        long arr[] = new long[n+1];
        for (int i=1; i<=n; i++){
            arr[i] = i*i;
        }
        System.out.printf("%d so chinh phuong dau tien: ",n);
        for(int i=1; i<=n; i++)
            System.out.print(arr[i]+" ");
    }
    
    static void nhapSo(){
        int n;
        // dang 1
        boolean flag=false;
        do {
            try{
                System.out.print("nhap so nguyen: ");
                n = Integer.parseInt(sc.next());
                flag = true;
                System.out.printf("so da nhap la: %d\n",n);
            }catch (Exception ex){
                System.out.println("ban nhap sai");
            }
        } while (flag==false);
        
        // dang 2
        while (true){
            try{
                System.out.print("nhap so nguyen: ");
                //n = sc.nextInt(); //bi troi lenh
                n = Integer.parseInt(sc.next()); // khong bi troi lenh
                System.out.println("so da nhap la: \n"+n);
                break;
            }catch (Exception ex){
            
            }
        }
    }
    
    // nhap ho ten 1 sv, in ra ho, ten dem, ten
    static void HoTen(){
        System.out.print("nhap ho ten: ");
        String s = sc.nextLine();
        s = s.trim();
        String[] S = s.split(" ");
        int word = S.length;
        String ho = S[0];
        String ten = S[word-1];
        String dem = "";
        for (int i=1; i<word-1; i++)
            dem += S[i]+" ";
        System.out.println("ho: "+ho);
        System.out.println("ten dem: "+dem);
        System.out.println("ten: "+ten);
    }
    
    public static void main(String[] args){
        HoTen();

    }
    
}
