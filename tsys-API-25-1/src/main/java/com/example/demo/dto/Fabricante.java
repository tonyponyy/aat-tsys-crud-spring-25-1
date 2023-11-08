package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Fabricantes")
public class Fabricante {

	// Atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre") // no es del todo necesario
	private String nombre;
	

	@JoinColumn(name = "fabricante") // tabla foranea
	@OneToMany()
	private List<Articulo> articulos;

	// Constructores de clase
	public Fabricante() {

	}

	public Fabricante(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "articulo")
	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + "]";
	}

}
