package org.example.lab8.Controller;

import org.example.lab8.Entity.Equipos;
import org.example.lab8.Repository.EquiposRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/equipos")
public class EquiposController {

    final EquiposRepository equiposRepository;

    public EquiposController(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    @GetMapping("")
    public List<Equipos> listar() {
        return equiposRepository.findAll();
    }

}
