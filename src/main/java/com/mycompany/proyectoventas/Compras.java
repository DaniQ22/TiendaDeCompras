/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoventas;

/**
 *
 * @author Usuario
 */
public class Compras {
    Cliente clientes;
    Productos productos;
    int cantidadComprada;
    double preciototal;
    
    public Compras (Cliente cli, Productos pro, int can, int preciototal){
        this.clientes = cli;
        this.productos = pro;
        this.cantidadComprada = can;
        this.preciototal = preciototal;
        
    }

 
    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }
    
    
    
    
    
    
    
}
