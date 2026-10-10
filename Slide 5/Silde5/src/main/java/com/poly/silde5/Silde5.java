/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.silde5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Acer
 */
public class Silde5 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         List<SinhVien> dsSinhVien = new ArrayList<>();
         dsSinhVien.add(new SinhVien("PS01", "An", 7.8, true));
         dsSinhVien.add(new SinhVien("PS02", "Binh", 5.2, true));
         dsSinhVien.add(new SinhVien("PS03", "Quy", 9.8, true));
         dsSinhVien.add(new SinhVien("PS04", "Vy", 8.9, false));
         
         //Xuat ds sv
         System.out.println(String.format("%12s%20s%12s%12s","Ma SV","Ten SV","Diem TB","Gioi Tinh"));
         for(SinhVien sv : dsSinhVien){
            System.out.println(sv);
         }
     }
}