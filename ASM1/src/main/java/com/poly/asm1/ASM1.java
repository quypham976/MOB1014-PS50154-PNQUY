/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.asm1;

/**
 *
 * @author Acer
 */
public class ASM1 {

    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.Nhap();
        System.out.printf("Thong tin San Pham: \n");
        sp.Xuat();
        System.out.printf("Cap Nhat San Pham Moi: \n");
        sp.capNhat();
        sp.Xuat();
        
    
    }
}
