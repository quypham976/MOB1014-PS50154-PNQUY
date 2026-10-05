/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Acer
 */
public class XuLyMang {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        boolean timThay = false;
        
        
      
        do{
            System.out.print("Nhap so phan tu:");
            n = sc.nextInt();// khai báo n là số nguyên
        }while(n<=0);
        
        int[]a = new int[n];//khai báo mảng
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap phan tu thu %d:",i);
            a[i] = sc.nextInt();
        }
        //Nhap X
        System.out.print("Nhap x:");
        x = sc.nextInt();
        for(int i = 0; i < a.length; i++) {
            if(x==a[i]){ // x se so sanh vi cua i trong mảng a 
                System.out.print(i + " ");
               timThay = true; 
            }
        }
        System.out.println();
        if(!timThay){
            System.out.printf("Khong Tim Thay");
        }
        //Tự viết thuật toán Bubble Sort để sắp xếp mảng giảm dần, xuất kết quả bằng Arrays.toString()
       for( int i = 0; i < a.length; i++){
           for ( int j = 0; j < a.length -i - 1; j++){
               if(a[j] < a[j+1]){ // giảm dần nên số lớn ddc đưa về phải
                   int temp = a[j]; //temp là giữ tạm số 
                   a[j] = a[j+1];
                   a[j+1] = temp;
                   
               }
           }      
       }
       
       System.out.println("Mang giam dan (Bubble Sort): " + Arrays.toString(a));
        int[] b = Arrays.copyOf(a, a.length);       
        Arrays.sort(b);
        System.out.print("Mang tang dan (Arrays.sort): " + Arrays.toString(b));
           
    }
}
