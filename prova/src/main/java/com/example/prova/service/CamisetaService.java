package com.example.prova.service;


import com.example.prova.model.CamisetaModel;
import com.example.prova.repository.CamisetaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CamisetaService {

    private final CamisetaRepository camisetaRepository;


    public CamisetaService(CamisetaRepository camisetaRepository) {
        this.camisetaRepository = camisetaRepository;
    }

    public CamisetaModel add(CamisetaModel camiseta) {
        camiseta = camisetaRepository.save(camiseta);
        return camiseta;
    }
    public List<CamisetaModel> getAll() {
        Optional<List<CamisetaModel>> camisetaOptional = Optional.of(camisetaRepository.findAll());
        return camisetaOptional.orElse(null);
    }
    public List<CamisetaModel> getByCategory(String categoria) {
        Optional<List<CamisetaModel>> produtoOptional = Optional.of(camisetaRepository.findByCategory(categoria));
        return produtoOptional.orElse(null);
    }
    public List<CamisetaModel> getAvailable() {
        Optional<List<CamisetaModel>> produtoOptional = Optional.of(camisetaRepository.findAllByAvailableIsTrue());
        return produtoOptional.orElse(null);
    }
    public void deleteById(Long codigo){
        if (camisetaRepository.existsById(codigo)) {
            camisetaRepository.deleteById(codigo);
        }
    }
}
