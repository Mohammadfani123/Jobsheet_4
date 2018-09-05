/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorophism;

/**
 *
 * @author Windows 10
 */
class Kucing extends hewan {
    void setNama(){
        String nama = "Carbereus";
        System.out.println("Nama Kucing : "+nama);
    }
    void setSuara (){
        String suara = "Meow Meong";
        System.out.println("Suara Kucing : "+suara);
    }
    void setBerat (){
        double berat = 2.0;
        System.out.println("Berat Kucing : "+berat+" Kg");
    }
}
