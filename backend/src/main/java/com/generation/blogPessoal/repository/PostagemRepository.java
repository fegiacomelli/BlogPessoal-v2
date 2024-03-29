package com.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogPessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
     
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);

	
	public Optional<Postagem> findById(Long id);

	
}
