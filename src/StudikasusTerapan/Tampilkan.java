/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleelectrocounter;

/**
 *
 * @author STEFFANO
 */
public class Tampilkan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilihan.Masukkan();
        Inputan mantap = new Inputan();
        mantap.Inputan();
        System.out.println("");
        System.out.println("Nomor pilihan anda adalah : "+mantap.PILIHAN());
        System.out.println("");
            if (mantap.PILIHAN()==1){
                System.out.println(mantap.VOLT() + " Volt");
                System.out.println(mantap.AMPERE() + " Ampere"); 
                System.out.println(mantap.WATTCOUNT() + " Watt");
        }else if(mantap.PILIHAN()==2){
                System.out.println(mantap.WATTAGE() + " Watt");
                System.out.println(mantap.AMPERE() + "Ampere");
                System.out.println(mantap.VOLTCOUNT() + " Volt");
        }else if (mantap.PILIHAN()==3){
                System.out.println(mantap.WATTAGE() + " Watt");
                System.out.println(mantap.VOLT() + " Volt");
                System.out.println(mantap.AMPCOUNT() + " Ampere");
                
        }
        System.out.println("");
        System.out.println("----------------TEKNIK PENYELESAIAN----------------");
        System.out.println("");
        mantap.FinalCount();
    }
}
