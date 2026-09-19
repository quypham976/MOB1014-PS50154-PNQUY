/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class hinhchunhat {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Chieu dai hinh chu nhat:");
        double dai = sc.nextDouble();
        System.out.printf("Chieu rong hinh chu nhat:");
        double rong = sc.nextDouble();
        double dt = dai*rong ;
        double cv = (dai+rong)*2 ;
        System.out.printf("Dien tich hinh chu nhat %.2f%n", dt) ;
        System.out.printf("Chu vi hinh chu nhat %.2f%n", cv) ;
    }
        
}
