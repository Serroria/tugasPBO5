/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package NilaiMahasiswa;
import java.util.Scanner;
/**
 *
 * @author meryl
 */
public class Data {
public String Nama;
public String NPM;
public double Hadir;
public double Tugas;
public double UTS;
public double UAS;
double Akhir;

public Data() {
    System.out.println("Data Mahasiswa");
     System.out.println("=====================================");
}


  void CetakNilai(){
        double nilaiHadir = this.Hadir * 10 / 100;
        double nilaiTugas = this.Tugas * 20 / 100;
        double nilaiUTS = this.UTS * 30 / 100;
        double nilaiUAS = this.UAS * 40 / 100;
        this.Akhir = nilaiHadir + nilaiTugas + nilaiUTS + nilaiUAS;
        
        
        
    }
  void Grade(){
      CetakNilai();
      double Akhir = this.Akhir;
      char nilai;
      String Ket;
      if (Akhir >=76 && Akhir <= 100){
          nilai = 'A';
          Ket = "ISTIMEWA";
      }else if (Akhir >= 66 && Akhir <=75){
          nilai = 'B';
          Ket = "BAIK";
      }else if (Akhir >= 56 && Akhir <= 65){
          nilai = 'C';
          Ket = "CUKUP";
      }else if (Akhir >= 46 && Akhir <= 55){
          nilai = 'D';
          Ket = "KURANG";
      }else{
          nilai = 'E';
          Ket = "KURANG SEKALI";
      }
       System.out.println("Grade = " + nilai);
        System.out.println("Keterangan = " + Ket);
  }
    
}
