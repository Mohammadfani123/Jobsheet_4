/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Windows 10
 */
public class Abstractsample {
    public static void main(String[] args){
       BangunDatar obj1 = new bujurSangkar(10);
       
        System.out.println("Luas Bujur Sangkar dengan Sisi 10 = "+obj1.hitungLuas());
        System.out.println("Kelilingnya                       = "+obj1.hitungKeliling());
        
        BangunDatar obj2 = new Lingkaran(7);
        System.out.println("Luas Lingkaran dengan Jari2 7 = "+obj2.hitungLuas());
        System.out.println("Kelilingnya                   = "+obj2.hitungKeliling());
    }
}
