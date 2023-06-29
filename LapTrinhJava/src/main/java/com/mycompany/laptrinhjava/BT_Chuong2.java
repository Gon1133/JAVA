//Phan Hoàng Huy
//21004063


package com.mycompany.laptrinhjava;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class BT_Chuong2 {
    static Scanner sc = new Scanner(System.in);
    
    static void cau1(){
        String s;
        do {
            System.out.print("Nhap ky tu bat ki: ");
            s = sc.next();
        }while (s.length() != 1);
        char n = s.charAt(0);
        
        if (Character.isLetter(n))
            System.out.println(n + " la ky tu");
        else 
            System.out.println(n + " khong phai la ky tu");
    }
    
    static void cau2(){
        System.out.print("Nhap so nguyen: ");
        int n = 0;
        try{
            n = sc.nextInt();
        }
        catch (Exception ex) {
            System.out.println("gia tri nhap khong hop le");
        }
        if (n == 0){
            System.out.println(n+" la so khong am khong duong");
            return;
        }
        else if (n < 0)
            System.out.print(n+" la so am");
        else if (n > 0)
            System.out.print(n+" la so duong");
        if (n % 2 == 0)
            System.out.println(" va la so chan");
        else
            System.out.println(" va la so le");
    }
    
    static void cau3(){
        System.out.print("nhap a: ");
        float a = sc.nextFloat();
        System.out.print("nhap b: ");
        float b = sc.nextFloat();
        System.out.print("nhap c: ");
        float c = sc.nextFloat();
        
        System.out.println("so lon nhat: "+ Math.max(a, Math.max(c, b)));
        System.out.println("so nho nhat: "+ Math.min(a, Math.min(c, b)));
    }
    
    static void cau4(){
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
            System.out.println(a+" "+b+" "+c+" la 3 canh cua tam giac");
        }
        else System.out.println(a+" "+b+" "+c+" khong la 3 canh cua tam giac");
    }
    
    
    static void cau5(){
        System.out.print("nhap diem co ban: ");
        float dcb = sc.nextFloat();
        System.out.print("nhap diem nang cao: ");
        float dnc = sc.nextFloat();
        double dtb = (dcb+dnc)/2;
        if (dtb >= 9 && dcb >= 8 && dnc >= 8)
            System.out.println("xuat sac");
        else if (dtb >= 8 && dcb >= 7 && dnc >= 7)
            System.out.println("gioi");
        else if (dtb >= 7 && dcb >= 6 && dnc >= 6)
            System.out.println("kha");
        else if (dtb >= 5 && dcb >= 3 && dnc >= 3)
            System.out.println("trung binh");
        else System.out.println("khong dat");
    }
    
    static void cau6(){
        System.out.print("nhap vao 2 so: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.print("nhap toan tu muon thuc hien: ");
        char t = sc.next().charAt(0);
        
        switch(t){
            case '+' -> System.out.println("tong cua "+a+","+b+" = "+(a+b));
            case '-' -> System.out.println("hieu cua "+a+","+b+" = "+(a-b));
            case '*' -> System.out.println("tich cua "+a+","+b+" = "+(a*b));
            case '/' -> System.out.println("thuong cua "+a+","+b+" = "+(a/b));
            default -> System.out.println("toan tu khong hop le");
        }
    }
    
    static void cau7(){
        int n;
        do {
            System.out.print("nhap n: ");
            n=sc.nextInt();
        }while(n<=0);
        
        long M=1;
        for (int i=1; i<=n; i++)
            M *= i;
        System.out.println("tich "+n+" so nguyen duong dau tien = "+M);
    }
    
    
    static void cau8(){
        int n;
        do {
            System.out.print("nhap n: ");
            n=sc.nextInt();
        }while(n<=0);
        
        double S = 0;
        for (int i=1; i<=n; i++)
            S += (double)i/(i+1);
        System.out.println("S = "+ S);
    }
    
    static void cau9(){
        int n;
        do {
            System.out.print("nhap n: ");
            n=sc.nextInt();
        }while(n<=0);
        
        long S = 0;
        for (int i=1; i<=n; i++){
            if (i % 3 == 0)
                S += -i;
            else S += i;
        }
        System.out.println("S = "+ S);
    }
    
    static void cau10(){
        int n;
        do {
            System.out.print("nhap n: ");
            n=sc.nextInt();
        }while(n<=0);
        int m;
        do {
            System.out.print("nhap m: ");
            m=sc.nextInt();
        }while(m<=0);
        
        long S = 0;
        for (int i=1; i<=n; i++)
            for (int j=1; j<=m; j++)
                S += i+2*j;
        System.out.println("S = "+S);
    }
    
    static void cau11(){
        int n;
        do {
            System.out.print("nhap n: ");
            n=sc.nextInt();
        }while(n<=0);
        
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++)
                System.out.print("@ ");
            System.out.println();
        }
            
    }
    
    
    static void cau12(){
        int cd;
        do {
            System.out.print("nhap cd: ");
            cd=sc.nextInt();
        }while(cd<=0);
        int cr;
        do {
            System.out.print("nhap cr: ");
            cr=sc.nextInt();
        }while(cr<=0);
        
        for (int i=0; i<cr; i++){
            for (int j=0; j<cd; j++)
                System.out.print("* ");
            System.out.println("");
        }
    }
    
    static int Giaithua(int n){
        if (n==1)
            return 1;
        else 
            return Giaithua(n-1)*n;
    }
    
    static void cau13(){
        int n;
        do {
            System.out.print("nhap n: ");
            n=sc.nextInt();
        }while(n<=0);
        System.out.print("nhap x: ");
        float x = sc.nextFloat();
        
        double e = 1;
        for (int i=1; i<=n; i++){
            e += Math.pow(-1, i+1)*Math.pow(x, n)/Giaithua(i);
        }
        System.out.println("e = "+e);
    }
    
    static void cau14(){
        double n, e=1; 
        int i=1;
        do {
            System.out.print("nhap n: ");
            n=sc.nextDouble();
        }while(n<=0);
        
        do{
            e += (double) 1/Giaithua(i);
            i++;
        }while(n >= (double) 1/Giaithua(i+1));
        

        System.out.println("e = "+e);
    }
    
    static void cau15(){
        int n, a=0, d=0;
        do {
            System.out.print("nhap so nguyen: ");
            n = sc.nextInt();
            if (n<0)
            a++;
            else if (n>0)
            d++;
        }while (n!=0);
        System.out.println("co "+a+" so am");
        System.out.println("co "+d+" so duong");
    }
    
    static void cau16(){
        float n, s=0;
        int count = -1;
        do {
            System.out.print("nhap so thuc: ");
            n = sc.nextFloat();
            s += n;
            count++;
        }while (n!=0);
        System.out.println("gia tri trung binh cac so vua nhap: "+ (s/count));
    }
    
    static void cau17(){
        float n;
        do{
            System.out.print("nhap so thuc: ");
            n = sc.nextFloat();
            if (n != 0) {
                System.out.println("Số đối của " + n + " là " + (-n));
            }
        }while (n!=0);
    }
    
    static boolean KTNgTo(int n){
        if (n<=1) 
            return false;
        
        for (int i=2; i <= Math.sqrt(n); i++)
            if (n%i==0)
                return false;
        return true;
        
    }
    
    static void cau18(){
        int n;
        do{
            System.out.print("nhap n: ");
            n = sc.nextInt();
        }while (n<=0);
        
        for (int i=2; i<n; i++)
            if (KTNgTo(i))
                System.out.print(i+" ");
    }
    
    static void cau19(){
        int n;
        do{
            System.out.print("nhap n: ");
            n = sc.nextInt();
        }while (n<=0);
        int max=0;
        for (int i=2; i<n/2; i++)
            if (i%2!=0 && n % i == 0)
                max = i;
        System.out.println("uoc so le lon nhat = "+ max);
    }
    
    static int cau20(int n){
        if (n==1 && n==2) return 1;
        else 
            return cau20(n-1) + cau20(n-2);
    }
    
    
    
    static void cau21(){
        int arr[];
        int n;
        do{
            System.out.print("nhap so ptu: ");
            n=sc.nextInt();
        }while(n<=0);
        arr = new int[n];
        
        //nhap mang
        for (int i=0; i<n; i++){
            System.out.printf("arr[%d]: ", i);
            arr[i]=sc.nextInt();
        }
        
        //xuat mang nguoc
        System.out.print("Xuat mang nguoc: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //co bao nhieu so ngto
        int d=0;
        for(int i=0; i<n; i++){
            if(KTNgTo(arr[i]))
                d++;
        }
        System.out.println("So ptu ngto: "+d);
        
        //tich cac ptu la uoc so cua k
        long M=1;
        System.out.print("Nhap k: ");
        int k = sc.nextInt();
        for (int i: arr){
            if (k % i == 0)
                M *= i;
        }
        System.out.printf("tich cac ptu la uoc so cua %d = %d", d, M);
        System.out.println();
        
        //ptu X xuat hien lan thu m tai vi tri thu may
        System.out.print("Nhap ptu X: ");
        int X = sc.nextInt();
        System.out.print("Nhap so lan xuat hien: ");
        int m = sc.nextInt();
        int t=0;
        for (int i=0; i<n; i++){
            if (arr[i]==X && t==m){
                System.out.printf("%d xuat hien lan thu %d tai vi tri thu %d",X,m,i);
                break;
            }
            else
                t++;
            if (i==n-1)
                System.out.println("mang ko co ptu "+X+" xuat hien lan thu "+m);
        }
        
        
        //sap xep va in mang giam dan
        System.out.print("mang sau khi sap xep giam dan: ");
        Arrays.sort(arr);
        for (int i=n-1; i>=0; i--)
            System.out.print(arr[i]+" ");
        
    }
    
    static void cau22(){
        float arr1[],arr2[];
        int n;
        do{
            System.out.print("Nhap so ptu: ");
            n=sc.nextInt();
        }while(n<=0);
        arr1 = new float[n];
        arr2 = new float[n];
        float arr3[] = new float[n];
        System.out.print("nhap gia tri ptu cho ca 2 mang:\n");
        for (int i=0; i<n; i++){
            System.out.printf("arr[%d]: ",i);
            arr1[i]=sc.nextFloat();
            arr2[i] = arr1[i];
            arr3[i] = arr1[i] + arr2[i];
        }
        //xuat mang
        System.out.print("mang thu 1: ");
        for (int i=0; i<n; i++)
            System.out.print(arr1[i]+" ");
        System.out.println();
        System.out.print("mang thu 1: ");
        for (int i=0; i<n; i++)
            System.out.print(arr2[i]+" ");
        System.out.println();
        System.out.print("mang thu 1: ");
        for (int i=0; i<n; i++)
            System.out.print(arr3[i]+" ");
        System.out.println();
    }
    
    static void cau23(){
        boolean arr1[],arr2[];
        int n;
        do{
            System.out.print("Nhap so ptu: ");
            n=sc.nextInt();
        }while(n<=0);
        arr1 = new boolean[n];
        arr2 = new boolean[n];
        boolean arr3[] = new boolean[n];
        boolean arr4[] = new boolean[n];
        System.out.print("nhap gia tri ptu cho ca 2 mang:\n");
        for (int i=0; i<n; i++){
            System.out.printf("arr[%d]: ",i);
            arr1[i] = sc.nextBoolean();
            arr2[i] = arr1[i];
            arr3[i] = arr1[i] & arr2[i];
            arr4[i] = arr1[i] | arr2[i];
        }
        
        System.out.print("mang thu 1: ");
        for (boolean i: arr1)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("mang thu 2: ");
        for (boolean i: arr2)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("mang thu 3: ");
        for (boolean i: arr3)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("mang thu 4: ");
        for (boolean i: arr4)
            System.out.print(i+" ");
        System.out.println();
    }
    
    static void cau24(){
        int arr[],n;
        do{
            System.out.print("nhap so ptu: ");
            n=sc.nextInt();
        }while(n<=0);
        arr = new int[n];
        //nhap mang
        for (int i=0; i<n; i++){
            System.out.printf("a[%d]: ",i);
            arr[i] = sc.nextInt();
        }
        //xuat mang
        System.out.print("mang vua nhap: ");
        for (int i: arr){
            System.out.print(i+" ");
        }
        
        //in ra vi tri cac ptu max
        int max=arr[0];
        for (int i=1; i<n; i++)
            if (max < arr[i]){
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }    
        System.out.print("vi tri phan tu lon nhat: ");
        for (int i=0; i<n; i++)
            if (max == arr[i])
                System.out.print(i+" ");
        //tinh trung binh cac ptu duong
        int S=0,d=0;
        for (int i: arr)
            if (i > 0){
                S += i;
                d++;
            }
        System.out.println("tri trung binh cac ptu duong = "+ (float)S/d);
        
        //dem so ptu la luy thua cua K
        // arr[i](t) = k*k*...*k mu m;
        System.out.print("nhap K: ");
        int K = sc.nextInt();
        d=0;
        for (int i: arr){
            int t=i;
            int m=0;
            while (t % K == 0){
                m++;
                t /= K;
            }
            if (Math.pow(K, m) == arr[i])
                d++;
        }
        System.out.printf("co %d ptu la luy thua cua %d",d,K);
    }
    
    
    
    static boolean KTtang(int arr[], int n){
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
                return false;
        return true;
        
    }
    
    static boolean KTgiam(int[] arr, int n){
        for (int i=0; i<n-1; i++)
            if (arr[i] < arr[i+1])
                return false;
        return true;
    }
    
    
    static void cau25(){
        int n;
        do{
            System.out.print("nhap so ptu: ");
            n=sc.nextInt();
        }while(n<=0);
        int[] arr = new int[n];
        //nhap mang
        for (int i=0; i<n; i++){
            System.out.printf("a[%d]: ",i);
            arr[i] = sc.nextInt();
        }
        //xuat mang
        System.out.print("mang vua nhap: ");
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        /*
        // in cac ptu nam o vi tri chan
        System.out.print("cac ptu nam o vi tri chan: ");
        for (int i=0; i<n; i++)
            if (i % 2 == 0)
                System.out.print(arr[i]+" ");
        System.out.println();
        
        // kiem tra day co thu tu ko
        
        if (KTtang(arr,n) == true)
            System.out.println("mang co thu tu tang");
        else if (KTgiam(arr,n) == true)
            System.out.println("mang co thu tu giam");
        else 
            System.out.println("mang khong co thu tu");
           
        
        //kiem tra mang co doi xung ko
        if (KTdoixung(arr,n))
            System.out.println("day co doi xung");
        else
            System.out.println("day ko co doi xung");
        
*/
        //tao 1 mang copy tu mang da nhap gom M ptu bat dau tu ptu thu K
        System.out.print("nhap so ptu mang thu 2: ");
        int M = sc.nextInt();
        int arr2[] = new int[M];
        System.out.print("Nhap vi tri copy: ");
        int K = sc.nextInt();
        
        for (int i=0; i<M; i++){
            if(n-1-i >= 0)
                arr2[i] = arr[K+i];
            else
                arr2[i] = 0;
        }
        //in mang
        System.out.print("mang copy: ");
        for (int i: arr2){
            System.out.print(i+" ");
        }
    }
    
    static boolean KTdoixung(int[] arr, int n){
        for (int i=0; i<n/2; i++)
            if (arr[i] != arr[n-1-i])
                return false;
        return true;
                
    }
    
    static void cau26(){
        float[][] arr;
        int m,n;
        do{
            System.out.print("nhap so hang: ");
            m = sc.nextInt();
            System.out.print("nhap so cot: ");
            n = sc.nextInt();
        }while(m<=0 || n<=0);
        arr = new float[m][n];
        //nhap
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr[i][j] = sc.nextFloat();
            }
        //xuat
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
        
        //bao nhieu ptu co phan nguyen chan
        int d=0;
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                if ((int)arr[i][j] % 2 == 0)
                    d++;
        System.out.printf("co %d ptu co phan nguyen la chan \n",d);
        
        // tinh tich cac ptu duong nam tren hang h
        System.out.print("nhap hang muon tinh tich: ");
        int h = sc.nextInt();
        double M=1;
        for (int j=0; j<n; j++){
            if (arr[h][j] > 0)
                M *= arr[h][j];
        }
        System.out.printf("tich tren hang %d = %f", h,M);
        System.out.println();
        
        // sap xep cot c tang dan
        System.out.print("nhap cot muon sap xep: ");
        int c = sc.nextInt();
        for (int i=0; i<m-1; i++)
            if (arr[i][c] > arr[i+1][c]){
                float t = arr[i][c];
                arr[i][c] = arr[i+1][c];
                arr[i+1][c] = t;
            }
        //in ma tran
        System.out.print("ma tran sau khi sap xep: \n");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    
    static void cau27(){
        int n;
        do {
            System.out.print("nhap so hang va cot ma tran: ");
            n = sc.nextInt();
        } while (n<=0);
        char arr[][] = new char[n][n];
        //nhap mang
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr[i][j] = sc.next().charAt(0);
            }
        }
        //xuat mang
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
        // cho biet ma tran co nhieu ky tu "T"
        int d=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i][j] == 'T')
                    d++;
            }
        }
        System.out.printf("ma tran co %d ky tu 'T'\n",d);
        
        //in ptu duong cheo phu
        System.out.print("ptu tren duong cheo phu: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i][n-1-i]+"\t"); 
        }
        System.out.println();
        
        //ky tu lon nhat tren duong cheo chinh
        char max = arr[0][0];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (max < arr[i][j])
                    max = arr[i][j];
            }
        }
        System.out.printf("ky tu lon nhat trong ma tran la: %s\n", max);
        
        //ma tran co hang nao co thu tu tang khong
        int arr2[] = new int[n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
                if (arr[i][j] > arr[i][j+1]){
                    break;
                }
                if (j == n-2){
                    arr2[i] = i;
                } 
            }
        }
        for (int i=0; i<=n; i++){
            if (i==n)
                System.out.println("ma tran khong co hang tang dan");
            else{
                System.out.print("hang co thu tu tang dan la hang: ");
                for (int j: arr2)
                    System.out.print(arr2[i]+"\t");
            }
        }
    }
    
    static void cau28(){
        int n;
        do {
            System.out.print("nhap hang, cot: ");
            n = sc.nextInt();
        } while (n<=0);
        int arr[][] = new int[n][n];
        //nhap
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        //in ma tran
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //ptu min nam o vi tri nao
        int min = arr[0][0];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (min > arr[i][j])
                    min = arr [i][j];
            }
        }
        System.out.print("ptu nho nhat nam o vi tri: ");
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                if (min == arr[i][j])
                    System.out.printf("[%d][%d]\t",i,j);
        System.out.println();
        //hang nao co tong lon nhat
        int[] arrS = new int[n];
        int S=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                S += arr[i][j];
            }
            arrS[i] = S;
            S=0;
        }
        int maxS = arrS[0];
        for (int i=1; i<n; i++)
            if (maxS < arrS[i])
                maxS = arrS[i];
        System.out.print("hang co tong lon nhat la: ");
        for (int i=0; i<n; i++)
            if (maxS == i)
                System.out.print(i+" ");
        System.out.println();
        //trung binh cua ptu duong trong ma tran
        int d=0;
        S=0;
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++){
                if (arr[i][j] > 0){
                    S += arr[i][j];
                    d++;
                }
            }
        double tb = S/d;
        System.out.println("gia tri trung binh cac ptu duong trong ma tran = " + tb);
        
    }
    
    static void cau29(){
        int m,n;
        do {
            System.out.print("nhap so hang: ");
            n = sc.nextInt();
            System.out.print("nhap so cot: ");
            m = sc.nextInt();
        } while (n<=0 || m<=0);
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        //nhap ma tran
        System.out.println("nhap ma tran thu 1:");
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr1[i][j] = sc.nextInt();
            }
        System.out.println("nhap ma tran thu 2:");
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr2[i][j] = sc.nextInt();
            }
        //xuat ma tran
        System.out.println("ma tran thu 1: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++)
                System.out.print(arr1[i][j] + "\t");
            System.out.println();
        }
        System.out.println("ma tran thu 2: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++)
                System.out.print(arr2[i][j] + "\t");
            System.out.println();
        }
        
        //tao ma tran 3 bang tong 2 ma tran vua nhap
        int[][] arr3 = new int[m][n];
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                arr3[i][j] = arr1[i][j] + arr2[i][j];
        System.out.println("ma tran thu 3: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++)
                System.out.print(arr3[i][j] + "\t");
            System.out.println();
        }
        
        //tao ma tran 4 bang hieu 2 ma tran vua nhap
        int[][] arr4 = new int[m][n];
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                arr4[i][j] = arr1[i][j] - arr2[i][j];
        System.out.println("ma tran thu 4: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++)
                System.out.print(arr4[i][j] + "\t");
            System.out.println();
        }
    }
    
    static void cau30(){
        int n,m,h,k;
        do{
            System.out.print("nhap so hang ma tran thu 1: ");
            m = sc.nextInt();
            System.out.print("nhap so cot ma tran thu 1: ");
            n = sc.nextInt();
        }while(n<=0 || m<=0);
        float[][] arr1 = new float[m][n];
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr1[i][j] = sc.nextFloat();
            }
        
        do{
            System.out.print("nhap so hang ma tran thu 2: ");
            h = sc.nextInt();
            System.out.print("nhap so cot ma tran thu 2: ");
            k = sc.nextInt();
        }while(n<=0 || m<=0);
        float[][] arr2 = new float[h][k];
        for (int i=0; i<h; i++)
            for (int j=0; j<k; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr2[i][j] = sc.nextFloat();
            }
        
        //kiem tra 2 ma tran co the tinh tich khong va luu tich thanh ma tran moi
        double arr3[][] = new double[m][n];
        if (m==h && n==k){
            System.out.println("2 ma tran co the tinh tich:");
            for (int i=0; i<m; i++)
                for (int j=0; j<n; j++)
                    arr3[i][j] = arr1[i][j] * arr2[i][j];
            for (int i=0; i<m; i++){
                for (int j=0; j<n; j++)
                    System.out.print(arr3[i][j]+"\t");
                System.out.println();
            }
        }
        else 
            System.out.println("2 ma tran khong the tinh tich");
    }
    
    static void cau31(){
        System.out.print("nhap so thap phan: ");
        int dec = sc.nextInt();
        String bin = Integer.toBinaryString(Math.abs(dec));
        if(dec < 0)
            bin = "-"+bin;
        
//        while(dec != 0){
//            int bit = dec % 2;
//            bin = bit + bin;
//            dec = dec / 2;
//        }
//        bin = new StringBuilder(bin).reverse().toString();
        System.out.println("So nhi phan tuong ung: "+ bin);
    }
    
    static void cau32(){
        System.out.print("nhap so nhi phan: ");
        String bin = sc.next();
        int dec = Integer.parseInt(bin,2);
        System.out.println("so thap phan: "+ dec);
    }
    
    static void cau33(){
        System.out.print("nhao so thap phan: ");
        int dec = sc.nextInt();
        String hex = Integer.toHexString(Math.abs(dec)).toUpperCase();
        if (dec<0)
            hex = "-"+hex;
        System.out.print("so thap luc phan tuong ung: "+hex);
    }
    
    static void cau34(){
        System.out.print("nhap so bat phan: ");
        String oct = sc.next();
        int dec = Integer.parseInt(oct, 8);
        String hex = Integer.toHexString(dec).toUpperCase();
        System.out.println("so thap luc phan tuong ung: "+hex);
    }

    static void cau35(){
        System.out.print("nhap so nhi phan: ");
        String bin = sc.next();
        int dec = Integer.parseInt(bin, 2);
        String oct = Integer.toOctalString(dec).toUpperCase();
        System.out.println("so thap luc phan tuong ung: "+oct);
    }
    
    
    
    static void cau36(){
        System.out.print("nhap chuoi: ");
        String s = sc.nextLine();
        s = new StringBuilder(s).reverse().toString();
        System.out.println("chuoi dao la: "+s);
    }
    
    
    
    static void cau37(){
        System.out.print("nhap chuoi ky tu: ");
        String s = sc.nextLine();
        String[] w = s.split(" ");
        System.out.print("Chuoi dao la: ");
        for (String i: w){
            String st = new StringBuilder(i).reverse().toString();
            System.out.print(st+" ");
        }
    }
    
    static void cau38(){
        int n;
        do {
            System.out.print("nhap so nguyen duong: ");
            n = sc.nextInt();
        } while (n<0 || n>1000);
        
        String[] dv = {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
        String[] cn = {"","mươi","trăm"};
        
        // Chuyển số nguyên thành chuỗi
        String s = String.valueOf(n);
        int len = s.length();
        int[] num = new int[len];
        // Lưu từng chữ số của số nguyên vào mảng num
        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(s.substring(i, i+1));
        }

        // Đọc số nguyên thành chữ
        s = "";
        for (int i = 0; i < len; i++) {
            if (num[i] != 0 || (i > 0 && (num[i-1] != 0 || num[i-2] != 0))) {
              s += dv[num[i]] + " " + cn[len-i-1] + " ";
            }
        }
        System.out.println("So " + n + " doc la: " + s);
    }
    
    static void cau39(){
        System.out.print("nhap chuoi cac chu so: ");
        String s = sc.next();
        int count = 0; // dem so day con tang dan
        String maxSub = ""; // luu day con tang dan dai nhat
        int n = s.length();
        
        for (int i = 0; i<n; i++) {
            String sub = ""; // luu day con dang xet
            sub += s.charAt(i); // them phan tu dau tien vao day con dang xet

            // tim cac phan tu con lai cua day con dang xet
            for (int j = i + 1; j < n; j++) {
                char c1 = sub.charAt(sub.length() - 1);
                char c2 = s.charAt(j);
                if (c2 > c1) {
                    sub += c2;
                }
                else {
                    break;
                }
            // tang so luong day con 
            count++; 
            }

            // cap nhat day con tang dan dai nhat
            if (sub.length() > maxSub.length()) {
                maxSub = sub;
            }
        }

        System.out.println("So day con tang dan trong chuoi la: " + count);
        System.out.println("Day con tang dan dai nhat la: " + maxSub);
    }     
                
    static void cau40(){
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        // tách các từ trong chuỗi và đếm số lần xuất hiện của từng từ
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
//            Key của HashMap là kiểu dữ liệu String
//            Value của HashMap là kiểu dữ liệu Integer
            if (wordCount.containsKey(word)) { //kiểm tra xem wordCount có chứa key là word không
                int count = wordCount.get(word); //lấy giá trị hiện tại của word trong wordCount.
                wordCount.put(word, count + 1); //thêm một lần đếm (count) vào giá trị của word trong wordCount
            } else {
                wordCount.put(word, 1); //thêm word vào wordCount với giá trị là 1
            }
        }

        // tìm từ có số lần xuất hiện nhiều nhất
        String mostWord = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) {// keySet() trả về một tập hợp chứa các key
            int count = wordCount.get(word);// lấy value của key=word, nếu ko có get() trả về null
            if (count > maxCount) {
                maxCount = count;
                mostWord = word;
            }
        }

        System.out.println("Từ xuất hiện nhiều nhất là: " + mostWord);
    }
        
        
    
    
    
    
    public static void main(String[] args){
        cau40();
    }
    
}
