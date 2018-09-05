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
//Lanjutan RerataNilai
public class TesTugas1 {
    public static void main(String[] args){
        RerataNilai A = new RerataNilai();
        System.out.println("Rata-Rata Nilai 123, 567 dan 744 adalah : "+A.average(123, 567, 744));
        System.out.println("Rata-Rata Nilai 21 dan 13 adalah : "+A.average(21.0, 13));
        System.out.println("Rata-Rata Nilai 19,3 dan 39,5 adalah : "+A.average(19, 39.5));
        
    }
}
