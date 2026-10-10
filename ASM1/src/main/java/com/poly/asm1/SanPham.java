/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.asm1;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class SanPham {
    String maSP;
    String tenSP;
    Double donGia;
    int soLuong;
    Scanner sc = new Scanner(System.in);
    public SanPham(){
    }
    public SanPham(String maSP, String tenSP, Double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public void Nhap() {
        System.out.print("Nhap ma San Pham:");
        maSP = sc.nextLine();
        System.out.print("Nhap ten San Pham:");
        tenSP = sc.nextLine();
        System.out.print("Nhap Don Gia:");
        donGia = sc.nextDouble();
        System.out.print("Nhap So Luong:");
        soLuong = sc.nextInt();
    }
    public void Xuat() {
        System.out.printf(" Ma San Pham: %s\n",maSP);
        System.out.printf(" Ten San Pham: %s\n",tenSP);
        System.out.printf("Don Gia: %.2f\n",donGia);
        System.out.printf("So Luong: %d\n",soLuong);
        System.out.printf("Thanh tien: %.2f\n",thanhTien());
    }
    public double thanhTien() {
        
        return soLuong * donGia ;
    }
    public void capNhat() {
//        System.out.print("Nhap Ten SP moi:");
//        tenSP = sc.nextLine();
//        System.out.printf("Nhap don gia moi: ");
//        donGia = sc.nextDouble();
//        System.out.printf("Nhap so luong moi:");
//        soLuong = sc.nextInt();
    
    //System.out.println("1. Sua ten");
        //System.out.println("2. Sua don gia");
        //System.out.println("3. Sua so luong");

        //System.out.print("Chon: ");
            //int chon = sc.nextInt();
            //sc.nextLine();

    //if (chon == 1) {
        //System.out.print("Nhap ten moi: ");
        //tenSP = sc.nextLine();
    //} else if (chon == 2) {
        //System.out.print("Nhap don gia moi: ");
        //donGia = sc.nextDouble();
    //} else if (chon == 3) {
        ////System.out.print("Nhap so luong moi: ");
        //soLuong = sc.nextInt();
        System.out.printf("1. Sua ten \n");
        System.out.printf("2. Sua don gia \n");
        System.out.printf("3. Sua so luong \n");

        System.out.print("Chon: ");
            int chon = sc.nextInt();
            sc.nextLine();

        switch (chon) {
            case 1:
                System.out.print("Nhap ten moi: \n ");
                tenSP = sc.nextLine();
                break;

            case 2:
                System.out.print("Nhap don gia moi: \n ");
                donGia = sc.nextDouble();
                break;
            case 3:
                System.out.print("Nhap so luong moi: \n ");
                soLuong = sc.nextInt();
                break;
            default:
                break;
        }
}
}