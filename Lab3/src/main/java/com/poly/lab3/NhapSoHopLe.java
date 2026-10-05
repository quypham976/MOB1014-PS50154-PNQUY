/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.lab3;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class NhapSoHopLe {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Nhap so nguyen: ");
        int so;
        int dem = 0;
        do {
            System.out.print("Nhap so nguyen: ");
            so = sc.nextInt();
            dem++;
            if (!(so > 0 && so % 3 == 0 && so % 5 == 0)) {
                System.out.printf("So khong hop le moi nhap lai !\n");
            }
       } while (!(so > 0 && so % 3 == 0 && so % 5 == 0));
        System.out.printf("So hop le : %d (sau %d lan nhap)\n", so, dem);
    }
}

    

