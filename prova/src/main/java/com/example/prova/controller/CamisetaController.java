package com.example.prova.controller;


import com.example.prova.model.CamisetaModel;
import com.example.prova.service.CamisetaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/camiseta")
public class CamisetaController {

    private final CamisetaService camisetaService;

    public CamisetaController(CamisetaService camisetaService) {
        this.camisetaService = camisetaService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CamisetaModel> addProduto(@RequestBody CamisetaModel camiseta) {
        return new ResponseEntity<>(camisetaService.add(camiseta), HttpStatus.CREATED);
    }

    @PostMapping("/listcategory/{categoria}")
    public ResponseEntity<List<CamisetaModel>> getByCategory(@PathVariable("categoria") String categoria) {
        return new ResponseEntity<>(camisetaService.getByCategory(categoria),HttpStatus.OK);
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<CamisetaModel>> getAllCamisetas(){
        return new ResponseEntity<>(camisetaService.getAll(),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{codigo}")
    public void deleteById(@PathVariable("codigo") Long codigo){
        camisetaService.deleteById(codigo);
    }

}
