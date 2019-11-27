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
        Scanner scan = new Scanner(System.in);
        System.out.print("We coś napisz: ");
        String napis = scan.nextLine();
        napis = napis.replaceAll(" ", "*").toLowerCase();
        System.out.println(napis);
        
        
    }
    
}
