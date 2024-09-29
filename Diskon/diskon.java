/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diskon;

/**
 *
 * @author meryl
 */
public class diskon {
    int total;
    
    int diskon1(){
        int hargaPotongan;
        if (total < 50000){
            hargaPotongan = total * 5/100;
        } else {
            hargaPotongan = total* 20/100;
        }
        
         return hargaPotongan;
    }
    
    int jumlahHarga(){
        int hargaSetelahDiskon = total - diskon1();
        return hargaSetelahDiskon;
    }
   

}
