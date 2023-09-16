/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoventas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TiendaCompras {

    Cliente[] cliente;
    Productos[] producto;
    Compras[] compra;
    int contadorcliente;
    int contadorcompras;
    int contadorproducto;
    String NombreTienda;

    public TiendaCompras(String nom) {
        cliente = new Cliente[20];
        producto = new Productos[20];
        compra = new Compras[50];
        contadorcliente = 0;
        contadorproducto = 0;
        contadorcompras = 0;
        this.NombreTienda = nom;

    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
  
    }

    public Productos[] getProducto() {
        return producto;
    }

    public void setProducto(Productos[] producto) {
        this.producto = producto;
        
    }

    public Compras[] getCompra() {
        return compra;
    }

    public void setCompra(Compras[] compra) {
        this.compra = compra;
    }

    public int getContadorcliente() {
        return contadorcliente;
    }

    public void setContadorcliente(int contadorcliente) {
        this.contadorcliente = contadorcliente;

    }

    public int getContadorcompras() {
        return contadorcompras;
    }

    public void setContadorcompras(int contadorcompras) {
        this.contadorcompras = contadorcompras;
    }

    public int getContadorproducto() {
        return contadorproducto;
    }

    public void setContadorproducto(int contadorproducto) {
        this.contadorproducto = contadorproducto;

    }

    public String getNombreTienda() {
        return NombreTienda;
    }

    public void setNombreTienda(String NombreTienda) {
        this.NombreTienda = NombreTienda;
    }
    
    
    public void registraCliente(Cliente cliente){
        this.cliente[this.contadorcliente] = cliente;
        this.contadorcliente ++;
        
    }
    
      
    public void registrarProducto(Productos producto){
        this.producto[this.contadorproducto] = producto;
        this.contadorproducto ++;
        
    }
    
      
    public void registraCompra(Compras compra){
        this.compra[this.contadorcompras] = compra;
        this.contadorcompras ++;
        
    }
    
    

    public void RegistrarCompra(int id, int codi, int can) {
        Cliente cli = this.buscarcliente(id);
        Productos pro = this.buscarProducto(codi);

        int preciototal = (int) (pro.getPrecio() * can);

        if (pro.getCantidad() == 0) {
            pro.setStock("No disponible");
        }

        this.compra[this.contadorcompras] = new Compras(cli, pro, can, preciototal);
        this.contadorcompras ++;

    }

    public String MostrarCliente() {
        String lis = "";
        for (int i = 0; i < this.contadorcliente; i++) {
            lis += "El Nit del cliente es: " + this.cliente[i].getIdentificacion() + "\n"
                    + "El Nombre del Cliente es: " + this.cliente[i].getNombre() + "\n"
                    + "El Apellido del Cleinte es: " + this.cliente[i].getApellido() + "\n" + "\n";
        }
        return lis;
    }

    public String MostrarProducto() {
        String lis = "";
        for (int i = 0; i < this.contadorproducto; i++) {
            lis += "El codigo del producto es: " + this.producto[i].getCodigo() + "\n"
                    + "El Nombre del producto es: " + this.producto[i].getNombreProducto() + "\n"
                    + "La cantidad total de los producto es: " + this.producto[i].getCantidad() + "\n"
                    + "El precio de cada Producto es:" + this.producto[i].getPrecio() + "\n"
                    + "Stock: " + this.producto[i].getStock() + "\n" + "\n";
        }
        return lis;
    }

    public String MostrarCompra() {
        String lis = "";
        for (int i = 0; i < this.contadorcompras; i++) {
            lis += "Nit del cliente es; " + this.compra[i].getClientes().identificacion + "\n"
                    + "Nombre del cliente; " + this.compra[i].getClientes().Nombre + "\n"
                    + "Producto comprado: " + this.compra[i].getProductos().NombreProducto + "\n"
                    + "Cantidad comprada: " + this.compra[i].getCantidadComprada() + "\n"
                    + "Pecio total es de: " + this.compra[i].getPreciototal() + "\n" + "\n";

        }
        return lis;
    }

    public Cliente buscarcliente(int ide) {
        Cliente buscliente = null;
        for (int i = 0; i < this.getContadorcliente(); i++) {
            if (this.cliente[i].getIdentificacion() == ide) {
                buscliente = cliente[i];

            } else {
                return null;
            }
        }
        return buscliente;
    }

    public Productos buscarProducto(int cod) {
        Productos buspro = null;
        for (int i = 0; i < this.getContadorproducto(); i++) {
            if (this.producto[i].getCodigo() == cod) {
                buspro = producto[i];
            } else {
                return null;
            }

        }
        return buspro;
    }

    public void validarcantida(int can) {
        int cannueva;
        for (int i = 0; i < this.contadorproducto; i++) {

            cannueva = this.producto[i].getCantidad() - can;
            this.producto[i].setCantidad(cannueva);

        
        }
    }

    
}
