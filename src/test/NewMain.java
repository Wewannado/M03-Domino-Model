/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domino1.Partida;

/**
 *
 * @author IES
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Partida partida = new Partida(4);
        partida.crearFitxes();
        System.out.println(partida.getFitxes());
        
    }
    
}
