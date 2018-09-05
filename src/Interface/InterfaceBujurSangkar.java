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
public class InterfaceBujurSangkar implements InterFaceBangunDatar {
    private double sisi;
    
    public InterfaceBujurSangkar(double sisi){
        this.sisi = sisi;
    }
    
    public double hitungKeliling(){
        return sisi * 4;
    }
    
    public double hitungLuas(){
        return sisi * sisi;
    }
}
