package br.com.beneficiario.model;

import java.time.LocalDateTime;

public class beneficiário {

    private Long idBeneficiário;
    private String nome;
    private String telefone;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
    private Documento documento;

}
