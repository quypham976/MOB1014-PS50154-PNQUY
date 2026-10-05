/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class TrungBinhChia3 {public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhap phep tinh:");
         int n = sc.nextInt();
         int tong = 0 ;
         int dem = 0; // giá trị của biến(đếm) bắt đầu = 0
         System.out.printf("cac so chia het cho 3 :",n,tong,dem);
         for (int i = 1; i <=n ;i++ ){
             if(i % 3 == 0){
             System.out.print(i+" ");
             tong += i; //,tong = tong + i
             dem++;  
             }
         }
    
    System.out.printf("Trung binh cong %.2f",(double)tong/dem);
        
    }
}

    

