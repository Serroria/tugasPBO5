/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaiMahasiswa;

import java.util.Scanner;

/**
 *
 * @author meryl
 */
public class Main {
    public static void main(String[]args){
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);

        //input NPM
        System.out.print("NPM Mahasiswa: ");
        data.NPM=scanner.nextLine();

        //input nama
        System.out.print("Nama: ");
        data.Nama=scanner.nextLine();

        //input Kehadiran
        System.out.print("Nilai Kehadiran: ");
        data.Hadir=scanner.nextDouble();

        //input Tugas
        System.out.print("Nilai Tugas: ");
        data.Tugas=scanner.nextDouble();

        //input UTS
        System.out.print("Nilai UTS: ");
        data.UTS=scanner.nextDouble();

        //input uas
        System.out.print("Nilai UAS: ");
        data.UAS=scanner.nextDouble();

         data.CetakNilai();

        System.out.println("=====================================");
        System.out.println("Output");
         System.out.println("------------------------------------");
        System.out.println("NPM Mahasiswa: " + data.NPM);  // Print NPM
        System.out.println("Nama Mahasiswa: " + data.Nama);  // Print Nama
        System.out.println("Nilai Rata-rata: " + data.Akhir);
        data.Grade();
        
         scanner.close(); 
}
}
