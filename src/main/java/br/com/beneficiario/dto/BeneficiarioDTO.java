package br.com.beneficiario.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class BeneficiarioDTO implements Serializable {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("dataNascimento")
    private LocalDateTime dataNascimento;

    @JsonProperty("documento")
    private List<DocumentoDTO> documento = new ArrayList<>();

}
