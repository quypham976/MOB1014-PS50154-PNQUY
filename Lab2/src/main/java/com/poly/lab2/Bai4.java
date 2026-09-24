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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a:");
        double a = sc.nextDouble();
        System.out.print("Nhap so b:");
        double b = sc.nextDouble();
        System.out.print("Nhap phep tinh:");
        char pheptinh = sc.next().charAt(0);
        switch (pheptinh){// chọn ( khai báo)
            case '+': //trường hợp
                System.out.printf("%.2f + %.2f = %.2f",a, b , a+b); //2f là 2float = hai số thực đứng sau dấu.
                break;
                case '-':
                System.out.printf("%.2f - %.2f = %.2f",a, b , a-b);
                break;
                case '*':
                System.out.printf("%.2f * %.2f = %.2f",a, b , a*b);
                break;// dừng
                case '/':
                    if (b==0){// nếu 
                        System.out.printf("khong the chia khong");
                    }
                    else { //ngược lại
             
                System.out.printf("%.2f / %.2f = %.2f",a, b , a/b);
                break;}
                default: //nếu không đúng trường hợp nào sẽ báo sai
                System.out.printf("Phep tinh khong hop le");
                    
        }
    }
    
}
