/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroazar;

import java.util.Random;

/**
 *
 * @author ESFOT
 */
public class NumeroAzar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random numAleatorio = new Random();
        int numero=numAleatorio.nextInt(1000);
        
        System.out.println(""+numero);
        
        // TODO code application logic here
    }
    
}
