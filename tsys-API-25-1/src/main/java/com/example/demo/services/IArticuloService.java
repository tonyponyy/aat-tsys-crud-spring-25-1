package com.example.demo.services;
import java.util.List;
import com.example.demo.dto.Articulo;

public interface IArticuloService {
	
	//Listar todos
	public List<Articulo> listarArticulos();
	
	//Listar por id
	public Articulo articuloXID(Integer id); 
	
	//Guardar
	public Articulo guardarArticulo(Articulo Articulo);
	
	//Actualizar
	public Articulo actualizarArticulo(Articulo Articulo);
	
	//Eliminar
	public void eliminarArticulo(Integer id);

	
}
