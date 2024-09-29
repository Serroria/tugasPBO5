/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KriteriaBadan;

/**
 *
 * @author meryl
 */
public class UkuranBadan {
    double beratBadan;
    double tinggiBadan;
    
    double hitunganIMT(){
        double  nilaiIMT = beratBadan/(tinggiBadan*tinggiBadan);
        return nilaiIMT;
    }
    
    String IMT(){
       double  nilaiIMT = hitunganIMT();
       String Kriteria;
       if (nilaiIMT < 18.4){
           Kriteria = "Berat Badan Kurang";
       } else if (nilaiIMT<=24.9 ){
           Kriteria = "Berat Badan Ideal";
       }else if (nilaiIMT<=29.9){
           Kriteria = "Berat Badan Lebih";
       }else if (nilaiIMT<=39.9){
           Kriteria = "Gemuk";
       }else {
           Kriteria = "Sangat Gemuk";
       }
        System.out.println("IMT: " + nilaiIMT);
        System.out.println("Kriteria: " + Kriteria);
         return String.format("IMT: %.2f\nKriteria: %s", nilaiIMT, Kriteria);
  
    }
}
