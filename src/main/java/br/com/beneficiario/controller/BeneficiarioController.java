package br.com.beneficiario.controller;

import br.com.beneficiario.model.Beneficiario;
import br.com.beneficiario.service.BeneficiarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/beneficiarios")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioService service;

    @Operation(summary = "Criar", description = "Método para criar Beneficiário", tags = "Beneficiário")
    @PostMapping
    public ResponseEntity<Beneficiario> create(@RequestBody Beneficiario beneficiario){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(beneficiario));
    }

    @Operation(summary = "Deletar por ID", description = "Método para deletar um Beneficiário pelo seu ID", tags = "Beneficiário")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Buscar por ID", description = "Método para buscar um Beneficiário pelo seu ID", tags = "Beneficiário")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Beneficiario> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.getID(id));
    }

    @Operation(summary = "Listar", description = "Método para listar todos os Beneficiário", tags = "Beneficiário")
    @GetMapping
    public ResponseEntity<List<Beneficiario>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @Operation(summary = "Atualizar por ID", description = "Método para atualizar um Beneficiário pelo seu ID", tags = "Beneficiário")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Beneficiario> update(@PathVariable Long id, @RequestBody Beneficiario beneficiario){
        beneficiario.setIdBeneficiario(id);
        return ResponseEntity.ok().body(service.update(beneficiario));
    }
}
