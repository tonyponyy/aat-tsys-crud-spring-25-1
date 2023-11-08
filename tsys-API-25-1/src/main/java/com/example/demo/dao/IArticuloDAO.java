package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Articulo;


public interface IArticuloDAO extends JpaRepository<Articulo,Integer> {



	
}
