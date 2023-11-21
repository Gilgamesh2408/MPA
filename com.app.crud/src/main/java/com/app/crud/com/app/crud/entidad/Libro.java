package com.app.crud.com.app.crud.entidad;

import javax.persistence.Entity;
import javax.persistence.GenerateValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	@GenerateValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nombre",nullable = false, length = 50)
	private String nombre;
	
	@Column(name="autor",nullable = false, length = 50)
	private String autor;
	
	@Column(name="coleccion",nullable = false, length = 50)
	private String coleccion;

	
	public Libro() {
		
	}


	public Libro(long id, String nombre, String autor, String coleccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.coleccion = coleccion;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getColeccion() {
		return coleccion;
	}


	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}


	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", coleccion=" + coleccion + "]";
	}
	
	
		
	}