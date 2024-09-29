/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diskon;
import java.util.Scanner;
/**
 *
 * @author meryl
 */
public class DiskonMain {
    public static void main(String[]args){
        diskon Potongan = new diskon();
        Scanner scanner = new Scanner(System.in);
        //input total harga
         System.out.println("INPUT");
          System.out.println("========================");
          System.out.print("Harga total: ");
        Potongan.total=scanner.nextInt();
        
     
        
        //output
        System.out.println();
        System.out.println("===================================");
        System.out.println("OUTPUT DISKON");
        System.out.println("---------------------------------");
        System.out.println("Total Pembelian = Rp"+Potongan.total);
        System.out.println("Besarnya potongan= Rp"+ Potongan.diskon1());
       
        System.out.println("Jumlah yang harus dibayar: Rp " + Potongan.jumlahHarga());
        
        scanner.close();
    }
}
