package com.alianza.co;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	private ClienteRepositorio repositorio;
	
	@Override
	public List<Cliente> listar() {
		 
		return repositorio.findAll();
	}

	@Override
	public Cliente listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente add(Cliente c) {		
		return repositorio.save(c);
	}

	@Override
	public Cliente edit(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
