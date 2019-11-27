/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziendobry;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Podaj liczbe pliska: ");
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        System.out.println("Twoja liczba to " + liczba);
    }
    
}
