package com.mycompany._phanhoanghuy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chuong2 {
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
    
    static void cau10(){
        System.out.print("nhap so nguyen: ");
        int n;
        try{
            n = sc.nextInt();
            switch(n){
                case 1: System.out.println("Chu nhat"); break;
                case 2: System.out.println("Thu hai"); break;
                case 3: System.out.println("Thu ba"); break;
                case 4: System.out.println("Thu tu"); break;
                case 5: System.out.println("Thu nam"); break;
                case 6: System.out.println("Thu sau"); break;
                case 7: System.out.println("Thu bay"); break;
                default: System.out.println("Ban da sai, chi duoc nhap so nguyen tu 1 toi 7");
            }
        }
        catch(Exception ex){
            System.out.println("Ban da sai, chi duoc nhap so nguyen tu 1 toi 7");
        }
    }
    
    static void cau11(){
    System.out.print("nhap so nguyen: ");
        int n;
        try{
            n = sc.nextInt();
            switch(n){
                case 0: System.out.println("Zero"); break;
                case 1: System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;
                case 4: System.out.println("Four"); break;
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;
                case 7: System.out.println("Seven"); break;
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;
                default: System.out.println("Ban da sai, chi duoc nhap so nguyen tu 0 toi 9");
            }
        }
        catch(Exception ex){
            System.out.println("Ban da sai, chi duoc nhap so nguyen tu 0 toi 9");
        }
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
    
    static void cau13(){
        int n;
        System.out.print("nhap so nguyen: ");
        try{
            n=sc.nextInt();
            for (int i=1; i<=10; i++){
                System.out.printf("%d x %d = %d\n",i,n,(long)(n*i));
            }
        }
        catch(Exception ex){
            System.out.println("ban phai nhap so nguyen");
        }
    }
    
    static void cau14(){
        System.out.println("DANG 1");
        for(int i=2; i<=10; i++){
            System.out.printf("Bang cuu chuong %d\n",i);
            for (int j=1; j<=10; j++){
                System.out.printf("%d x %d = %d\n",i,j,(j*i));
                if (j==10)
                    System.out.println();
            }
        }
        System.out.println();

        System.out.println("DANG 2");
        for(int i=2; i<=10; i++){
            System.out.printf("\nBang cuu chuong %d",i);
            for (int j=1; j<=10; j++){
                if (j % 2 != 0)
                    System.out.println();
                System.out.printf("%d x %d = %d\t",i,j,(j*i));
                if (j==10)
                    System.out.println();
            }
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
    
    static void cau16(){
        int m,n;
        do {
            System.out.print("nhap so hang: ");
            m=sc.nextInt();
            System.out.print("nhap so hang: ");
            n=sc.nextInt();
        } while (m<=0 || n<=0);
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        //nhap mang
        System.out.println("nhap mang thu nhat");
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d] = ",i,j);
                arr1[i][j] = sc.nextInt();
            }
        System.out.println("nhap mang thu hai");
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d] = ",i,j);
                arr2[i][j] = sc.nextInt();
            }
        //in mang
        int[][] arr3 = new int[m][n];
        System.out.println("Tong 2 ma tran vua nhap");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
                System.out.printf("%d ",arr3[i][j]);
            }
            System.out.println();
        }
        System.out.println("Hieu 2 ma tran vua nhap");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr3[i][j] = arr1[i][j]-arr2[i][j];
                System.out.printf("%d ",arr3[i][j]);
            }
            System.out.println();
        }
        System.out.println("Tich 2 ma tran vua nhap");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr3[i][j] = arr1[i][j]*arr2[i][j];
                System.out.printf("%d ",arr3[i][j]);
            }
            System.out.println();
        }
    }
    
    static boolean SoNgto(long n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static void cau17(){
        System.out.print("nhap chuoi so nguyen: ");
        String s = sc.nextLine();
        String[] S = s.split(" ");
        int[] arr = new int[S.length];
        System.out.printf("chuoi so vua nhap co %d so\n",S.length);
        System.out.printf("cac so co trong chuoi: ");
        for (int i=0; i<S.length; i++){
            arr[i] = Integer.parseInt(S[i]);
            System.out.printf("%d ", arr[i]);
        }
        
        System.out.print("\ncac so nguyen to trong chuoi la: ");
        for (int i: arr)
            if (SoNgto(i))
                System.out.printf("%d ", i);
        
    }
        
    static void cau18(){
        System.out.print("nhap chuoi so thuc: ");
        String s = sc.nextLine();
        String[] S = s.split(";");
        float[] arr = new float[S.length];
        
        // doi kieu string -> float va dua vao mang arr
        for (int i=0; i<S.length; i++)
            arr[i] = Float.parseFloat(S[i]);
        System.out.printf("co %d so thuc vua nhap\n",S.length);
        
        // lam tron cac so
        for (int i=0; i<S.length; i++){
            arr[i] = Math.round(arr[i]);
        }
        
        // dua so vao dang chuoi
        StringBuilder round = new StringBuilder(); // khai bao 1 doi tuong StringBuilder (khac voi kieu String)
        for (int i=0; i<arr.length; i++){
            round.append(arr[i]); // them vao chuoi
            if (i<arr.length-1)
                round.append(";");
        }
        System.out.printf("chuoi so sau khi lam tron: "+ round.toString());
    }
    
    static boolean SoThuanNghich(String s){
        // Xóa khoảng trắng và chuyển về chữ thường để dễ so sánh
        s = s.replaceAll("\\s+","");

        // khai bao s2 la 1 doi tuong cua SB tu chuoi s1
        // Đảo ngược chuỗi
        String s2 = new StringBuilder(s).reverse().toString();

        // So sánh chuỗi ban đầu với chuỗi đảo ngược
        // so sanh bien s1 voi bien s2 neu la chuoi -> true, nguoc lai -> null
        return s.equals(s2);
    }
   
    static void cau19(){
        System.out.print("nhap chuoi so: ");
        String s = sc.next();
        if (SoThuanNghich(s)) 
            System.out.printf("%s la chuoi so thuan nghich doc.",s);
        else 
            System.out.printf("%s khong la chuoi so thuan nghich doc.",s);
    }
    
    static void cau20(){
        System.out.println("tat ca so thuan nghich co 6 chu so la: ");
        for (int i=100001; i<1000000; i+=11){
            if (SoThuanNghich(Integer.toString(i)))
                System.out.printf(i+"\n");
        }
    }
    
    static long SumOfDigits(long n){
        int Sum = 0;
        for (int i=1; n>0; i++){
            Sum += n%10;
            n /= 10;
        }
        return Sum;
    }
    
    static void cau21(){
        System.out.print("nhap S (S>0,nguyen): ");
        int S = sc.nextInt();
        System.out.printf("cac so nguyen to co 5 chu so co tong moi chu so = %d la:\n",S);
        for (long i=10000; i<100000; i++)
            if (SoNgto(i)){
                if (SumOfDigits(i) == S)
                    System.out.println(i);
            }
    }
    
    
    
    static void cau22(){
        int n;
        do {
            System.out.print("nhap so luong ptu thuc: ");
            n = sc.nextInt();
        } while (n<=0);
        double a,max=0;
        double S=0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        do {
            do {
                System.out.print("nhap so thuc duong: ");
                a = Double.parseDouble(sc.next()); // nhap bang '.'
                //a = sc.nextDouble(); // nhap bang ','
            } while (a<0);
            // tinh tong
            S+=a;
            // tim max
            if (max < a)
                max = a;
            // tim nguyen ngto
            if (SoNgto((int)a)){
                s1.append(a);
                s1.append(" ");
            }
            // tim thap phan = 0
            if (a % 1 == 0){
                s2.append(a);
                s2.append(" ");
            }
                
            n--;
        } while (n!=0);
        System.out.println("tong cac so vua nhap: "+S);
        System.out.println("so lon nhat vua nhap la: "+max);
        System.out.println("cac so co phan nguyen la nguyen to: "+s1.toString());
        System.out.println("cac so co phan thap phan = 0: "+s2.toString());
    }
    
    static void cau23(){
        int n,m;
        do {
            System.out.print("nhap so hang: ");
            n = sc.nextInt();
            System.out.print("nhap so cot: ");
            m = sc.nextInt();
        } while (n<=0 || m<=0);
        int[][] arr = new int[n][m];
        // nhap mang
        boolean flag;
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++){
                do{
                    flag = false;
                    try{
                        System.out.printf("arr[%d][%d] = ",i,j);
                        arr[i][j] = Integer.parseInt(sc.nextLine());
                        if (arr[i][j]>=0 && arr[i][j]<=100)
                            flag = true;
                        else 
                            System.out.println("chi duoc nhap so nguyen >0 va <100");
                    }catch (Exception ex){
                        System.out.println("chi duoc nhap so nguyen");
                    }
                }while (flag == false);
            }
        // in mang
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++)
                System.out.printf("%d\t",arr[i][j]);
            System.out.println();
        }
        
        
        // tim ptu lon nhat cung chi so 
        int max = arr[0][0];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.printf("ptu lon nhat la %d va chi so cua ptu do: ",max);
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (arr[i][j] == max)
                    System.out.printf("[%d][%d] ",i,j);
            }
        }
        System.out.println();
        //in ma tran cac ptu nguyen to
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (SoNgto(arr[i][j]))
                    System.out.printf(arr[i][j]+"\t");
                else 
                    System.out.printf("0\t");
            }
        }
        System.out.println();
        //sap xep tat ca cot theo thu tu tang dan
        for (int j=0; j<m; j++){
            for (int i=0; i<n-1; i++){
                for (int o=i+1; o<n; o++){
                    if (arr[i][j] < arr[o][j]){
                        int t = arr[i][j];
                        arr[i][j] = arr[o][j];
                        arr[o][j] = t;
                    }
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    
    
    static void cau24(){
        int n;
        do {
            try{
                System.out.print("nhap so luong ptu: ");
                n = Integer.parseInt(sc.next());
                break;
            }catch (Exception ex){
                System.out.println("nhap so nguyen");
            }
        } while (true);
        //nhap mang
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            do {
                try{
                    System.out.printf("arr[%d] = ",i);
                    arr[i] = Integer.parseInt(sc.next());
                    if (arr[i]>0 && arr[i]<100)
                            break;
                    else 
                        System.out.println("chi duoc nhap so nguyen >0 va <100");
                }catch (Exception ex){
                    System.out.println("nhap so nguyen");
                }
            } while (true);
        }
        //in mang
        System.out.print("mang sau khi nhap: ");
        for (int i: arr)
            System.out.print(i+" ");
        System.out.println();
        
        //tim ptu max va lon thu 2 trong mang va chi so cua cac so do
        int[] arr2 = arr;
        Arrays.sort(arr2);
        int max1 = arr2[n-1];
        int max2=0;
        //tim ptu lon thu hai tu mang da sap xep tang
        for (int i=n-1; i>=0; i--)
            if (arr2[i] < max1){
                max2 = arr2[i];
                break;
            }
                
        System.out.print("chi so cua ptu lon nhat: ");
        for (int i=0; i<n; i++){
            if (max1 == arr[i])
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("chi so cua ptu lon thu hai: ");
        for (int i=0; i<n; i++){
            if (max2 == arr[i])
                System.out.print(i+" ");
        }
        System.out.println();
        // sap xep giam
        System.out.print("mang sau khi sap xep giam dan: ");
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (arr[i] < arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
        for (int i: arr)
            System.out.print(i+" ");
        System.out.println();
        // chen X vao A dang giam dan
        int X;
        do {
            try{
                System.out.print("nhap so nguyen muon chen: ");
                X = Integer.parseInt(sc.next());
                break;
            }catch (Exception ex){
                System.out.println("chi dc nhap so nguyen");
            }
        } while (true);
        
        
        for (int i=0; i<n-1; i++){
            int j=i+1;
            if (X < arr[i] && X > arr[j]){
                n++;
                for (int o=n-1; o>j; o--)
                    arr[o] = arr[o-1];
                arr[j] = X;
            }
        }
        System.out.print("mang sao khi chen X: ");
        for (int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }
    
    static void cau25(){
        String s;
        do {
            System.out.print("nhap chuoi: ");
            s = sc.nextLine().toLowerCase().replaceAll("\\s+", " ");
        } while (s.isEmpty());
        
        String S[] = s.split(" ");
        String s1 = "";
        for (int i=0; i<S.length; i++){
            String t = S[i].substring(0, 1).toUpperCase();
            if (i!=S.length-1)
                s1 += t + S[i].substring(1)+" ";
            else
                s1 += t + S[i].substring(1)+" ";
        }
        System.out.println("chuoi sau khi chuan hoa: "+s1);
    }
    
    static void cau26(){
        String s;
        do {
            System.out.print("nhap chuoi: ");
            s = sc.nextLine().toLowerCase().replaceAll("\\s+", " ");
        } while (s.isEmpty());
        
        String S[] = s.split(" ");
        int max = S[0].length();
        for (String i: S)
            if (max < i.length())
                max = i.length();
        for (int i=0; i<S.length; i++)
            if (max == S[i].length()){
                System.out.println("Tu dai nhat trong chuoi la: "+S[i]+ " o vi tri thu "+i);
                break;
            }
    }
    
    
    
    
    public static void main(String[] args) {
        cau26();
        
    }
}
