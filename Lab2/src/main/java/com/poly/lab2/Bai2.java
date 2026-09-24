/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab2;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Bai2 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);  
        System.out.print("Nhap diem toan:");
        double toan = sc.nextDouble();
        System.out.print("Nhap diem Ly:");
        double Ly = sc.nextDouble();
        System.out.print("Nhap diem Hoa:");
        double Hoa = sc.nextDouble();
    
    if (toan<0 || toan>10 || Ly<0 || Ly>10 || Hoa<0 || Hoa>10){
         System.out.printf("Diem khong hop le");
         return;  //kết thúc chương trình      
    }
        double DiemTB = ( toan*2 + Ly + Hoa)/4 ;
        String XepLoai;
        if (DiemTB>=8) {
            XepLoai = " Gioi";
        }else if (DiemTB >= 6.5) {
            XepLoai = "Kha";
        }else if (DiemTB >= 5) {
            XepLoai = " Trung binh";       
        }else {
        XepLoai = " Yeu";}
        
        System.out.printf("Diem trung binh: %.2f\n",DiemTB);
        System.out.printf("Xep loai %s\n",XepLoai);
    }
    
}    
                

