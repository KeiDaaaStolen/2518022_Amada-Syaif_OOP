/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang extends BangunDatar implements Keliling, SimetriBangunDatar {
    public double panjang, lebar;

    @Override
    public double hitungluas() {
        return (panjang * lebar);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Luas Persegi panjang = " + Double.toString(hitungluas()));
        System.out.println("Keliling Persegi Panjang = " + Double.toString(hitungKeliling()));
        System.out.println("Banyak simetri Putar = " + hitungSimetriputar());
    }

    @Override
    public double hitungKeliling() {
        return (2 * (panjang + lebar));
    }

    @Override
    public double hitungSimetriputar() {
        return 2.0;
    }
}