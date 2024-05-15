package br.org.serratec.editora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.editora.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

	
	List<Livro> findByTituloStartingWith(String inicioDoTitulo);
	
	List<Livro> findByAutorEndingWith(String finalDoAutor);
	
	List<Livro> findByAutorAndTitulo(String buscaAutor, String buscaTitulo);
	
}
