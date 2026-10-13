/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Array là một mảng dùng để lưu trữ nhiều giá trị có cùng kiểu dữ liệu trong một biến. Khi tạo mảng, số lượng phần tử sẽ được cố định.
// List là một interface trong Java, dùng để quy định các thao tác với danh sách phần tử, chẳng hạn như thêm, xóa, sửa và lấy phần tử
// ArrayList là một lớp trong Java, dùng để lưu trữ nhiều phần tử và cho phép thêm hoặc xóa phần tử, khiến số lượng phần tử thay đổi linh hoạt.
/**
 *
 * @author Acer
 */
public class NhapXuatLaptop {
    //Constructor là một phần đặc biệt trong class, được dùng để khởi tạo đối tượng và gán giá trị ban đầu cho các thuộc tính.
    // 1.Constructor không tham số là Constructor không nhận dữ liệu nào từ bên ngoài khi tạo đối tượng.
    // 2.Constructor có tham số là Constructor nhận dữ liệu từ bên ngoài để khởi tạo đối tượng.
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        String choice;
        
        do {
            Laptop lt = new Laptop();
            lt.input(sc);
            list.add(lt);
            System.out.print("Tiep tuc nhap? (y/n): ");
            choice = sc.nextLine();
        }while(choice.equals("y") || choice.equals("Y"));
        
        System.out.printf("=== DANH SACH LAPTOP (%d may) ===\n", list.size());
        for (Laptop laptop : list) {
            laptop.output();
        }
    }
    
}
