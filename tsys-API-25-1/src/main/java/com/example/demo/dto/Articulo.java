package com.example.demo.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Articulos")
public class Articulo {

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}





	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}





	// Atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre") // no es del todo necesario
	private String nombre;
	private int precio;
	
	   @ManyToOne 
	    @JoinColumn(name = "fabricante") 
	    private Fabricante fabricante;

	// Constructores de clase
	public Articulo() {

	}

	public Articulo(int id, String nombre, int precio, Fabricante fabricante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

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

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + "]";
	}

}
