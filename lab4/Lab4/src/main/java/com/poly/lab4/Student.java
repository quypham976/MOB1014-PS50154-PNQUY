/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Student {
    String id;
    String hoTen;
    int tuoi;
    double gpa;  
    Scanner sc = new Scanner(System.in);
    public Student (){
        
    }
    public Student (String id, String hoTen, int tuoi, double gpa ){
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gpa = gpa;
        
    }

    public String getId() {
        return id;
    }

    public String gethoTen() {
        return hoTen;
    }

    public int gettuoi() {
        return tuoi;
    }

    public double getgpa() {
        return gpa;
    }

    public void setid(String id) {
        this.id = id;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void settuoi(int tuoi) {
        if (tuoi < 0)
            System.out.println("Tuoi khong hop le");
        else 
            this.tuoi = tuoi;
    }

    public void setgpa(double gpa) {
        if (gpa < 0 || gpa > 10)
            System.out.println("GPA khong hop le");
        else 
            this.gpa = gpa;
    }
//    public double getgpa(double gpa){
//        return gpa;
//    }

    public void Input (){
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap gpa: ");
        gpa = sc.nextDouble();
    }
    
//    public void Output(){
//        System.out.printf("ID : %s\n",id );
//        System.out.printf("Ho ten: %s\n", hoTen);
//        System.out.printf("Tuoi: %d\n", tuoi);
//        System.out.printf("GPA: %.2f\n", gpa);
//    }
  
    
    

    public String Rank(){
        if (gpa >=9){
            return "Excellent";
        }
        else if (gpa >=8){
            return "Very Good";
        }
        else if (gpa >=6.5){
            return "Good";
        }
        else if (gpa >=5){
            return "Average";
        }
        else {
            return "Fail";
        }
    }
    public void Output(){
        System.out.printf("ID: %s | Ho ten: %s | tuoi: %d | GPA: %.2f | Xeploai: %s\n",id , hoTen, tuoi, gpa, Rank());
  }

}

    
    

