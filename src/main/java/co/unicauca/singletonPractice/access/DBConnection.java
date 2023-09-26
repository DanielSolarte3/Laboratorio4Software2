/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.singletonPractice.access;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dafer
 */
public class DBConnection{
    //Instancia de la conexion a la base de datos
    private static DBConnection instance = new DBConnection();
    
    //Lista de clientes conectados
    private List<String> clientes = new ArrayList<>();
    private String ultimoCliente;
    
    //Constructor privado
    private DBConnection(){}
    
    //Get
    public static DBConnection GetDBConnection(){
        if(instance==null){
            instance = new DBConnection();
        }
        return instance;
    }
    
    //Metodos
    public boolean Connect(String nombreCliente){
        ultimoCliente=nombreCliente;
        clientes.add(nombreCliente);
        System.out.println("El cliente "+nombreCliente+" se ha conectado.");
        System.out.println("El ultimo cliente que se conecto fue: "+ultimoCliente);
        
        return true;
    }
    
    public boolean Disconnect(String nombreCliente){
        for(int i=0;i<=clientes.size();i++){
            if(clientes.get(i).equals(nombreCliente)){
                clientes.set(i, null);
                System.out.println("El cliente "+nombreCliente+" se ha desconectado.");
                return true;
            }
        }
        return false;
    }
    
}
