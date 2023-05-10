package com.alianza.co;

 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
	List<Cliente>findAll();
	//Cliente findOne(int id);
	//Cliente save(Cliente c);
	//void delete(Cliente c);
}
