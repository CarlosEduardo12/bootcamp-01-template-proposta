package br.com.zup.bootcamp.proposta.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String documento;
    @Email
    private String email;
    @NotBlank
    private String nome;
    @NotBlank(message = "Obrigatorio")
    private String endereco;
    @Positive
    private BigDecimal salario;

    @Deprecated
    public Proposta (){}

    public Proposta(@NotBlank String documento, @Email String email, @NotBlank String nome, @NotBlank String endereco, @Positive BigDecimal salario) {
        this.documento = documento;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }


    public Long getId() {
        return id;
    }
}
