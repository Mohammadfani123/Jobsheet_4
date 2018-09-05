/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Windows 10
 */
public class InterfaceSample {
    public static void main(String[] args){
        InterfaceBujurSangkar obj1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas Bujur sangkar dengan sisi 10 = "+obj1.hitungLuas());
        System.out.println("kelilinganya = "+obj1.hitungKeliling());
        
        InterFaceBangunDatar obj2 = new InterfaceSegitiga(6,8){};
        System.out.println("Luas Segitiga dg alas 6, tinggi 8 = "+obj2.hitungLuas());
        System.out.println("Kelilingnya = "+obj2.hitungKeliling());
    }
}
