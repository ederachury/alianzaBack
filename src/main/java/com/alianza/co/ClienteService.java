package com.alianza.co;

import java.util.List;

public interface ClienteService {
	List<Cliente>listar();
	
	Cliente listarId(int id);
	Cliente add(Cliente P);
	Cliente edit(Cliente P);
	Cliente delete(int id);
		
}
