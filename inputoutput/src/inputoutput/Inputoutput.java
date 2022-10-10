/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput;

import java.util.Scanner;

/**
 *
 * @author tolga
 */
public class Inputoutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi Girin");
        String isim = input.nextLine();

        System.out.println("Yasinizi girin : ");
        int yas = input.nextInt();

        System.out.println("Pi sayisini girer misin ?");
        double pi = input.nextDouble(); // double giriş yaparken nokta değil virgül kullan input olarak nokta alınmıyor !!!

        System.out.println("Adin : " + isim + "\nYasin " + yas + "\nPi:  " + pi);

    }

}
