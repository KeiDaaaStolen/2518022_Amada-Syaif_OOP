/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_2518022;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        BurungDara b = new BurungDara();
        System.out.println(" Burung Dara");
        b.bernafas();
        b.terbang();
        b.tampil();
        System.out.println(" ");
        Kucing k = new Kucing();
        System.out.println(" Kucing");
        k.bernafas();
        k.terbang();
        k.tampil();
    }
}
