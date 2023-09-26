/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.singletonPractice.service;

import co.unicauca.singletonPractice.access.DBConnection;

/**
 *
 * @author dafer
 */
public class Cliente extends Thread{
    
    public String nombreCliente;
            
    public Cliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    
    @Override
    public void run() {
        DBConnection conn = DBConnection.GetDBConnection();
        System.out.println("El cliente "+nombreCliente+" se esta intentando conectar al objeto: "+conn.hashCode());
        conn.Connect(nombreCliente);
        
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            System.out.println("El sleep se ha detenido...");
        }
        conn.Disconnect(nombreCliente);
    }
}
