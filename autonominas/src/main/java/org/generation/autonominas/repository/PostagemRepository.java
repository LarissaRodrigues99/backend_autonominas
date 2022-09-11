package org.generation.autonominas.repository;

import java.util.List;

import org.generation.autonominas.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagem,Long> {
	public List<Postagem>findAllByTituloContainingIgnoreCase(String tipo);
	public List<Postagem>findAllByConteudoContainingIgnoreCase(String tipo);
}