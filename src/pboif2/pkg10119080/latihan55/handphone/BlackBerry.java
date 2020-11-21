/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan55.handphone;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Handphone
 */
public class BlackBerry extends Handphone {
    
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga, String pinBB) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
    }
    
    public String getPinBB() {
        return this.pinBB;   
    }
    
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
}