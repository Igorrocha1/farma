package com.farma.farmacorp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farma.farmacorp.model.Produto;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllBynomeProdutoContainigIgnoreCase (String nomeProduto);
}
