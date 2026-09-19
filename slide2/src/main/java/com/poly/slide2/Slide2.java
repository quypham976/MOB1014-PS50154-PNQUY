/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.slide2;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Slide2 {

    public static void main(String[] args) {
        int so = 1234;
        String chuoi ="",them ="";
        while (so > 0){
            int du = so %10;
                so=so/10;
            switch (du){
                case 0:
                    them = "khong";
                    break;
                case 1:
                    them ="mot";
                    break;
                case 2:
                    them ="hai";
                    break;
                case 3:
                    them ="ba";
                    break;
                case 4:
                    them ="bon";
                    break;
                    
                    
      
            }  
            chuoi = them+" "+chuoi;
        }     
        System.out.printf("%s",chuoi);
    }
    
}
