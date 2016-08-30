package org.money.repository;

import java.util.Date;

import java.util.List;

import org.money.models.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Long>{
	
	List<Movimento> findByDescricao(String descricao); 

}
