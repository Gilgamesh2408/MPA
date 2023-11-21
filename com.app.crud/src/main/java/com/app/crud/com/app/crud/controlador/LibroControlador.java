package com.app.crud.com.app.crud.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.crud.com.app.crud.entidad.Libro;
import com.app.crud.com.app.crud.repositorio.LibroRepositorio;
import com.app.crud.com.app.crud.servicio.LibroServicio;

@Controller
public class LibroControlador {
	
	@Autowired
	private LibroServicio servicio;
	
	@GetMapping({"/Libro","/"})
	public String ListarLibros(Model modelo) {
		modelo.addAttribute("libros", servicio.ListarTodosLosLibros());
		return "libros";//nos retorna el archivo libros
	}
	
	@GetMapping("/libros/nuevo")
	public String crearLibroFormulario(Model modelo) {
		Libro libro= new Libro();
		modelo.addAttribute("libro",libro);
		return "crear_libro";
		
	@GetMapping("/libros/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable long id,Model modelo);
		modelo.addAttribute("libro",servicio.obtenerLibroPorId(id));
		return "editar_estudiante";
		
	}
	
	@PostMapping("libro/{id}")
	public String actualizarLibro(@PathVariable long id,@ModelAtribute("Libro") Libro libro) {
		return null;
	}
	Libro libroExistente = servicio.obtenerLibroPorId(id);
	libroExistente.setId(id);
	libroExistente.setNombre(libro.getNombre();)
	libroExistente.setAutor(libro.getAutor());
	libroExistente.setColeccion(libro.getColeccion());
	
	servicio. actualizarLibro(libroExistente);
	return "redirect:/estudiantes";
	
}

@GetMapping("/libros/{id}")
public Striing eliminarLibro(@PathVariable long id) {
	servicio.eliminarLibro(id);
	return "redirect:/libros";
}
