/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bantubudi;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class bantu_budi {

    /**
     * @param args the command line arguments
     */

        public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static double luasSegitiga(double alas,double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    public static double luasLingkaran(double JariJari) {
        return Math.PI * Math.pow(JariJari, 2);
    }
    
    public static void main(String[] args) {
        
        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukkan panjang persegi panjang:"));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukkan lebar persegi panjang:"));
        double luasPersegiPanjang = luasPersegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang);
        JOptionPane.showMessageDialog(null, "luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukkan alas segitiga:"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukkan tinggi segitiga:"));
        double luasSegitiga = luasSegitiga(alasSegitiga,tinggiSegitiga);
        JOptionPane.showMessageDialog(null, "luas Segitiga: " + luasSegitiga);
        System.out.println("Luas Segitiga: " + luasSegitiga);
        
        double jariJariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("masukkan masukkan jari-jari lingkaran:"));
        double luasLingkaran = luasLingkaran(jariJariLingkaran);
        JOptionPane.showMessageDialog(null, "luas Lingkaran: " + luasLingkaran);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
    }
}
