package com.outfit.closet_app.controller;

import com.outfit.closet_app.model.Prenda;
import com.outfit.closet_app.service.PrendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prendas")
@CrossOrigin(origins = "*")
public class PrendaController {

    private final PrendaService prendaService;

    public PrendaController(PrendaService prendaService) {
        this.prendaService = prendaService;
    }

    @GetMapping
    public List<Prenda> listarPrendas() {
        return prendaService.listarPrendas();
    }

    @PostMapping
    public Prenda crearPrenda(@RequestBody Prenda prenda) {
        return prendaService.guardarPrenda(prenda);
    }

    @DeleteMapping("/{id}")
    public void eliminarPrenda(@PathVariable Long id) {
        prendaService.eliminarPrenda(id);
    }

    @GetMapping("/ping")
    public String ping() {
        return "Servidor funcionando ✅";
    }

}
