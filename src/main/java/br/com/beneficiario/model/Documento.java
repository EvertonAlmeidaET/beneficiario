package br.com.beneficiario.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "IdDocumento")

@Entity
@Table(name = "tb_documento")
public class Documento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDocumento;

    @JsonProperty("tipoDocumento")
    private String tipoDocumento;

    @JsonProperty("descricao")
    private String descricao;

    @JsonProperty("dataInclusao")
    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataInclusao;

    @JsonProperty("dataAtualizacao")
    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataAtualizacao;
}
