package com.Farmacia.Domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Farmacia implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre;
    private String descripcion;

    public Farmacia() {
    }

    public Farmacia(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
    //PRUEBA
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }
    
    // FIN PRUEBA
}
