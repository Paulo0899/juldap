package br.edu.unibratec.psc.dbdemo.filme;

import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository
 */
public interface FilmeRepository extends CrudRepository<Filme, Integer> {

    
}