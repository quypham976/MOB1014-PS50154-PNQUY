/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.silde5;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private double diemTB;
    private boolean gioiTinh;
    Scanner quy = new Scanner(System.in);
    public SinhVien() {
        
    }
    public SinhVien(String maSV, String tenSV, double diemTB, boolean gioiTinh){
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTB = diemTB;
        this.gioiTinh = gioiTinh;
    }
      public String getmaSV(){
          return maSV;
      }
      public void setmaSV(String maSV){
          this.maSV = maSV;
      }
      public String gettenSV(){
          return tenSV;
      }
      public void settenSV(String tenSV){
          this.tenSV = tenSV;
          
      }
      public double getdiemTB(){
          return diemTB;
      }
      public void setdiemTB(double diemTB){
          this.diemTB = diemTB;
      }
      public String getgioiTinh(){
          return gioiTinh?"nam":"nu";
      }
      public void setgioiTiinh(){
          this.gioiTinh = gioiTinh;
      }
      @Override
     public String toString() {
         return String.format("%12s%20s%12.2f%12s",this.maSV,this.tenSV,this.diemTB,this.getgioiTinh());
     }
     
     void nhap(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhap ma sv: ");
         this.maSV = sc.nextLine();
         System.out.print("Nhap ten sv: ");
         this.tenSV = sc.nextLine();
         System.out.print("Nhap diem TB sv: ");
         this.diemTB = sc.nextDouble();
         System.out.print("Nhap gioi tinh sv: ");
         this.gioiTinh = sc.nextBoolean();
}
}