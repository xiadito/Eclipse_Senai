package com.project.isac_.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.isac_.entities.Usuario;
import com.project.isac_.repositores.UsuarioRepository;

public class UsuarioServices {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> procurarTodos(){
		return repository.findAll();
	}
	public Usuario procuraPorId(Integer id) {
		return repository.findById(id).get();
	}
	public String adicionarUsuario(Usuario usuario) {
		repository.save(usuario);
		return "Usuário adicionado com sucesso!!";
	}
	public String editarUsuario(Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();
		
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setSenha(usuario.getSenha());
		
		repository.save(response);
		return "Usuário Editado com sucesso!!";
		
	}
	public void excluirUsuario(Integer id) {
		Usuario response = repository.findById(id).get();
		repository.delete(response);
	}
}
