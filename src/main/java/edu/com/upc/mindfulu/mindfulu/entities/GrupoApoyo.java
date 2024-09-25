package edu.com.upc.mindfulu.mindfulu.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "grupoapoyo")
public class GrupoApoyo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrupoApoyo;

    @Column(name = "tipoGrupoApoyo", length = 20, nullable = false)
    private String tipoGrupoApoyo;

    @Column(name = "descripcionGrupoApoyo", length = 50, nullable = false)
    private String descripcionGrupoApoyo;

    @Column(name = "fechacreacion",nullable = false)
    private LocalDate fechacreacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
