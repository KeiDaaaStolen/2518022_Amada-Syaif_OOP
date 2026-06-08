/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_2518022;

/**
 *
 * @author ASUS
 */
public class hewan {
    String nafas = "tidak bisa bernafas";
    String terbang = "tidak bisa terbang";
    
    public void setNafas(String nafas){
        this.nafas =nafas;
    }
    
    public void setTerbang(String terbang){
        this.terbang = terbang;
    }
     
    public void tampil(){
        System.out.println(" hewan ini adalah Hewan Peliharaan yang :");
        System.out.println("============================================");
        System.out.println(nafas);
        System.out.println(terbang);
    }
}
