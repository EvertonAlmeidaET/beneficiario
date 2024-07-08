package br.com.beneficiario.service;

import br.com.beneficiario.model.Beneficiario;
import br.com.beneficiario.model.Documento;
import br.com.beneficiario.repository.BeneficiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BeneficiarioService {

    @Autowired
    private BeneficiarioRepository repository;

    public Beneficiario create(Beneficiario beneficiario){
        beneficiario.setDataInclusao(LocalDateTime.now());

        List<Documento> documentoNovo = beneficiario.getDocumento();
        documentoNovo.stream().forEach(documento -> {
            documento.setDataInclusao(LocalDateTime.now());
        });

        beneficiario.setDocumento(documentoNovo);
        return repository.save(beneficiario);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Beneficiario getID(Long id){
        Optional<Beneficiario> beneficiario = repository.findById(id);
        return beneficiario.get();
    }

    public List<Beneficiario> getAll(){
        return repository.findAll();
    }

    public Beneficiario update(Beneficiario beneficiario){
        Optional<Beneficiario> newBeneficiario = repository.findById(beneficiario.getIdBeneficiario());
        updateBeneficiario(newBeneficiario, beneficiario);
        return repository.save(newBeneficiario.get());
    }

    private void updateBeneficiario(Optional<Beneficiario> newBeneficiario, Beneficiario beneficiario) {

        Beneficiario beneficiarioNovo = newBeneficiario.get();
        beneficiarioNovo.setNome(beneficiario.getNome());
        beneficiarioNovo.setTelefone(beneficiario.getTelefone());
        beneficiarioNovo.setDataNascimento(beneficiario.getDataNascimento());
        beneficiarioNovo.setDataInclusao(beneficiario.getDataInclusao());
        beneficiarioNovo.setDataAtualizacao(LocalDateTime.now());

        List<Documento> documentoNovo = beneficiario.getDocumento();

        documentoNovo.stream().forEach(documento -> {
            documento.setTipoDocumento(documento.getTipoDocumento());
            documento.setDescricao(documento.getDescricao());
            documento.setDataInclusao(documento.getDataInclusao());
            documento.setDataAtualizacao(LocalDateTime.now());
        });

        beneficiarioNovo.setDocumento(documentoNovo);
    }
}
