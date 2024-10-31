package com.Farmacia.Domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="medicamentos")
public class Productos {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private int id_categoria;
    
    public Productos() {
    }

    public Productos(Long id, String nombre, String descripcion, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getStock(){
        return stock;
    }
    
    
}
