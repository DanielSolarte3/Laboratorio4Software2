/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.singletonPractice.domain;

import co.unicauca.singletonPractice.access.DBConnection;
import co.unicauca.singletonPractice.service.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dafer
 */
public class Main {
    public static void main(String [] args){
        Cliente cliente1 = new Cliente("Alberto");
        
        Cliente cliente2 = new Cliente("Mario");
        
        cliente1.start();
        cliente2.start();
    }
}
