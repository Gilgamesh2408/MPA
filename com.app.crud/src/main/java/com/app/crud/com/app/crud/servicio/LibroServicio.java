package com.app.crud.com.app.crud.servicio;

public interface LibroServicio {
	
	public List<Libro> ListarTodosLosLibros();
	
	public Libro guardarLibro(Libro libro);
	
	public Libro obtenerLibroId(long id);
	
	public Libro actualizarLibro(Libro libro);
	
	public void eliminarLibro(long id);
}
