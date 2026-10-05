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
public class TimKiemSapXep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ,x = 0;
        
        do {
            System.out.print("Nhap so phan tu: ");
            n = sc.nextInt();
        }while (n <=0);
       int[]a = new int[n];
       for (int i=0; i<n; i++){
           System.out.printf("Nhap vao phan tu: %d", i);
           a[i] = sc.nextInt();
       }
           System.out.printf("Nhap x:", x);
           x = sc.nextInt();
        
        
    }
}
