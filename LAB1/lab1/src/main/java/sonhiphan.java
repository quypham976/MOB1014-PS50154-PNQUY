/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class sonhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bat phan :");
        int n = sc.nextInt() ;
        String ab = " " ;
        
        while (n>0) {
            int du = n%8;
            ab = du + ab;
            n = n/8;
           
        }
        System.out.printf("so bat phan: %s", ab);
    }
}
