package com.app.crud.com.app.crud.servicio;

import java.util.List;

import org.springframework.stereotype.Service;
import com.app.crud.com.app.crud.entidad.*;


@Service
public class LibroServicioImpl implements LibroServicio {

	@Autowired
	private LibroRepositorio repositorio;
	
	
	@Override
	public List<Libro> ListarTodosLosLibros(){
		return repositorio.findAll();
	}
	
	@Override
	public Libro guardarLibro(Libro libro);{
		return repositorio.save(estudiante);
	}
	
	@PostMapping("/libros")
	public String guardarLibro(@ModelAtribute("libro") Libro libro ) {
		servicio.guardarLibro(libro);
		return "redirect:/estudiantes";
		
	}

	@Override
	public com.app.crud.com.app.crud.servicio.Libro guardarLibro(com.app.crud.com.app.crud.servicio.Libro libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.app.crud.com.app.crud.servicio.Libro obtenerLibroId(long id) {
		return repositorio.findById(id).get(;
	}

	@Override
	public com.app.crud.com.app.crud.servicio.Libro actualizarLibro(com.app.crud.com.app.crud.servicio.Libro libro) {
		return repositorio.save(libro);
	}

	@Override
	public void eliminarLibro(long id) {
		return repositorio.deleteById(Libro);
	}

}
