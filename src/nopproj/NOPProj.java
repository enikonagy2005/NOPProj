/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nopproj;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class NOPProj {
    //Szökőév methódus
    public static boolean szokoeve(int ev){
        boolean a = true;
        if ((ev > 1582) && (ev % 4 == 0) && (ev % 100 != 0) || (ev % 400 == 0)) {
            a = true;
        }
        else {
            a = false;
        }
        return a;
    }
    
    public static void main(String[] args) {
        // addig kér be a felhasználótól egy évszámot, amíg az nem szökőév
        //kiírja a végén az évszámot fordítva
        System.out.println("Adjon meg egy évszámot: ");
        int ev= scanner.nextInt();
        
 
        
    }
    
}
