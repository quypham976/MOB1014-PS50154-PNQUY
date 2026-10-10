/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;

/**
 *
 * @author Acer
 */
public class DongGoiSinhVien {
    public static void main(String[] args) {
        Student sv = new Student("PS002", "Tran Thi Binh", 20, 7.0);
        sv.setgpa(12);
        System.out.println("GPA hien tai: " + sv.getgpa());
        sv.setgpa(9.2);
        sv.Output();
    
}
}
