package br.com.beneficiario.model;

import java.time.LocalDateTime;

public class Documento {

    private Long IdDocumento;
    private String tipoDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
}
