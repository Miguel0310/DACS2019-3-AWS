package br.univille.dacs2019.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.dacs2019.model.Cliente;

@Service
public interface ClienteService {
	
	List<Cliente> getAll();

	void save(Cliente cliente);
	
	void remove(Cliente cliente);
	
	Cliente findById(long id);
}
//Interface para nao implementar as regras de negocio no Código.
