/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicoperations;

/**
 *
 * @author tolga
 */
import java.util.Scanner;
public class Logicoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ilk sayiyi girin");
        Scanner a = new Scanner(System.in);
        System.out.println("Ikinci sayiyi girin");
        Scanner b = new Scanner(System.in);
        
        if(a < b) {
            System.out.println("ilk sayi daha buyuk");
        } 
    }
    
}
