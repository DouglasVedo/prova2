package com.example.prova.repository;

import com.example.prova.model.CamisetaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CamisetaRepository extends JpaRepository<CamisetaModel, Long> {

    List<CamisetaModel> findAllByAvailableIsTrue();

    List<CamisetaModel> findByCategory(String categoria);


}
