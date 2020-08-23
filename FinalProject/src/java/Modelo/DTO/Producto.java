/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Producto implements Serializable{
    
    private int id;
    private String nombre;
    private String descripcion;
    private int unidades;
    private int valor;
    private int iva;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public Producto(int id, String nombre, String descripcion, int unidades, int valor, int iva) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.valor = valor;
        this.iva = iva;
    }

    public Producto(String nombre, String descripcion, int unidades, int valor, int iva) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.valor = valor;
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    public Producto() {
    }
    
}
