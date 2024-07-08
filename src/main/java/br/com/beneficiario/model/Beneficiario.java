package br.com.beneficiario.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "idBeneficiario")

@Entity
@Table (name = "tb_beneficiario")
public class Beneficiario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBeneficiario;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("dataNascimento")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dataNascimento;

    @JsonProperty("dataInclusao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone="GMT-3")
    private LocalDateTime dataInclusao;

    @JsonProperty("dataAtualizacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone="GMT-3")
    private LocalDateTime dataAtualizacao;

    @JsonProperty("documento")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_beneficiario")
    private List<Documento> documento = new ArrayList<>();

}
