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
public class Bai1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Nhap so n");
       int n = sc.nextInt();
       if (n%2 ==0){
           System.out.printf("%d la so chan\n",n);
       }
       else {
           System.out.printf("%d la so le\n",n);
       }   
      if (n>0){
          System.out.printf("%d la so nguyen duong:",n);
      }
      else if (n<0){
          System.out.printf("%d la so nguyen am:",n);
      }
      else {
          System.out.printf("%d bang 0\n",n);
      }
    }
}
