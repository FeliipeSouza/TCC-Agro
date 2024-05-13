package com.TCC.Agro.Core.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "Usuario")
@Entity(name = "Usuario")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Login")
    private String Login;

    @Column(name = "Senha")
    private String Senha;

    @Column(name = "Email")
    private String Email;

    @Enumerated(EnumType.STRING)
    @Column(name = "TipoUsuario")
    private com.TCC.Agro.Core.util.TipoUsuario TipoUsuario;

}
