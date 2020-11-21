/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan55.handphone;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan Harga 
 *                     handphone dari berbagai OS.
 */
public class BlackBerry extends Handphone{
   private String pinBB; 
   
   public BlackBerry(String man, String os, String model, int harga){
       super(man,os,model,harga);
   }
   public String getPinBB() {
       return pinBB;
   }
   public void setPinBB(String pinBB) {
       this.pinBB = pinBB;
   }
}
