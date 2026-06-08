/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_2518022;

/**
 *
 * @author ASUS
 */
public class Kucing extends hewan implements nafas, terbang {
    @Override
    public void bernafas() {
        setNafas("bisa bernafas");
    }

    @Override
    public void terbang() {
        setTerbang("tidak bisa terbang");
    }
}
