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
public class Android extends Handphone {
    
    private String keyStore;
    
    public Android(String man, String os, String model, int harga, String keyStore) {
        super(man, os, model, harga);
        this.keyStore = keyStore;
    }
    
    public String getKeyStore(){
        return this.keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
    
}