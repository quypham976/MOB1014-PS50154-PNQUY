/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("So luong sinh vien khong hop le, xin moi nhap lai.");
        }while(n <= 0);
        sc.nextLine();
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Student();
            ds[i].Input();
        }
        System.out.println("=== DANH SACH SINH VIEN ===");
        for (Student d : ds) {
            d.Output();
        }
        
        Student sMaxGPA = ds[0];
        System.out.println("=== SINH VIEN CO GPA CAO NHAT ===");
        for (Student d : ds) {
            if (d.getgpa() > sMaxGPA.getgpa())
                sMaxGPA = d;
        }
        sMaxGPA.Output();
        
        System.out.println("=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (ds[j].getgpa() < ds[j+1].getgpa()) {
                    Student temp = ds[j];
                    ds[j] = ds[j+1];
                    ds[j+1] = temp;
                }
            }
        }
        for (Student d : ds) {
            d.Output();
        }
    }
    
}
