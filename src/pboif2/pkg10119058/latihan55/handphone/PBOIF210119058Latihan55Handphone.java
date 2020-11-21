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
public class PBOIF210119058Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android = new Android("Samsung","Android","Grand",3000000);
        android.setKeyStore("234ibfd3840fo");
        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerry.setPinBB("BHS249");
        WindowsPhone windows = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windows.setWpKeyStore("UUUQIJWORJ");
        
        android.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        System.out.println("");
        blackBerry.displayProduct();
        System.out.println("PIN : "+blackBerry.getPinBB());
        System.out.println("");
        windows.displayProduct();
        System.out.println("Wp Key Store : "+windows.getWpKeyStore());
    }
    
}