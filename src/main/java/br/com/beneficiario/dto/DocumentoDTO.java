package br.com.beneficiario.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DocumentoDTO implements Serializable {

    @JsonProperty("tipoDocumento")
    private String tipoDocumento;

    @JsonProperty("descricao")
    private String descricao;

}
