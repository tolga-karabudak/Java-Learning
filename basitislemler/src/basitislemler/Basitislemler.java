/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basitislemler;

/**
 *
 * @author tolga
 */
import java.util.Scanner;
public class Basitislemler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int sayi1, sayi2, toplam, fark, carpim, kalan;
        double bolum;

        System.out.print("İlk Sayiyi Giriniz: ");
        sayi1 = a.nextInt();
        System.out.print("2. Sayiyi Giriniz: ");
        sayi2 = a.nextInt();
        toplam = sayi1 + sayi2;
        fark = sayi1 - sayi2;
        carpim = sayi1 * sayi2;
        bolum = (double) sayi1 / sayi2;
        kalan = sayi1 % sayi2;
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Carpim: " + carpim);
        System.out.println("Bolum: " + bolum);

        System.out.println("Kalan: " + kalan);
    }
    
}
