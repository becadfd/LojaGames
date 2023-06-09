package org.generation.lojadegames.repository;

import java.util.List;

import org.generation.lojadegames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByGeneroContainingIgnoreCase(@Param ("genero") String genero);
	
}
