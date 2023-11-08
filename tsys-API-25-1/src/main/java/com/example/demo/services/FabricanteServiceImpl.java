package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Fabricante;
import com.example.demo.dao.IFabricanteDAO;


@Service
public class FabricanteServiceImpl implements IFabricanteService {
	
	@Autowired
	IFabricanteDAO iFabricanteDAO;

	//Listar todos
		public List<Fabricante> listarFabricantes(){
			return iFabricanteDAO.findAll();
		};
		
		
		//Listar por id
		public Fabricante fabricanteXID(Integer id) {
			return iFabricanteDAO.findById(id).get();
		}; 
		
		//Guardar
		public Fabricante guardarFabricante(Fabricante Fabricante) {
			return iFabricanteDAO.save(Fabricante);
		};
		
		//Actualizar
		public Fabricante actualizarFabricante(Fabricante Fabricante) {
			return iFabricanteDAO.save(Fabricante);
		};
		
		//Eliminar
		public void eliminarFabricante(Integer id) {
			iFabricanteDAO.deleteById(id);
		}
		 


}
