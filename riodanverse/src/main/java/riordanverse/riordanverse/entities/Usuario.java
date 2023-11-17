package riordanverse.riordanverse.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
     private String nome;

    @Column(nullable = false)
    private String funcao;

    // TODO: associar a entidade criatura
    @Column(nullable = false)
    private String criatura;

    // TODO: associar a entidade acampamento
    @Column
    private String acampamento;
}