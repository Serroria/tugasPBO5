/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KriteriaBadan;
import java.util.Scanner;
/**
 *
 * @author meryl
 */
public class MainUkuranBadan {
     public static void main(String[]args){
         UkuranBadan badan = new UkuranBadan();
         Scanner scanner = new Scanner(System.in);
         System.out.println("=======================================");
          System.out.println("Input");
           System.out.println("---------------------------------------");
         //input berat
           System.out.print("Berat Badan (Kg): ");
          badan.beratBadan=scanner.nextDouble();
         
          //input tinggi
          System.out.print("Tinggi Badan(m): ");
          badan.tinggiBadan=scanner.nextDouble();
            
//output  
 System.out.println();
 System.out.println("=======================================");
 System.out.println("Output");
 System.out.println("---------------------------------------");
 System.out.println("Berat badan: "+badan.beratBadan+"Kg");
 System.out.println("Tinggi badan: "+badan.tinggiBadan+"m");
badan.IMT();
 scanner.close();
     }
}
