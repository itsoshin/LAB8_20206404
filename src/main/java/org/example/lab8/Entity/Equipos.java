package org.example.lab8.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipos")
@Getter
@Setter
@JsonIgnoreProperties(value = {"id","nombreEquipo","cantJugadores","correo","telefono"})

public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idequipos", nullable = false)
    private Integer id;

    @Column(name = "nombre_equipo", nullable = false, unique = true, length = 100)
    private String nombreEquipo;

    @Lob
    @Column(name = "equipo_tag", nullable = false, unique = true, length = 5)
    private String equipoTag;

    @Column(name = "nombre_capitan")
    private String nombreCapitan;

    @Column(name = "cant_jugadores", nullable = false, length = 10)
    private String cantJugadores;

    @Column(name = "juego")
    private String juego;

    @Column(name = "pais")
    private String pais;

    @Column(name = "correo_contacto")
    private String correo;

    @Column(name = "telefono_contacto", nullable = false, length = 9)
    private Double telefono;

    @Column(name = "estado",nullable = false)
    private Boolean estado = true;
}





