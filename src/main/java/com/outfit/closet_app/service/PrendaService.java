package com.outfit.closet_app.service;


import com.outfit.closet_app.model.Prenda;
import com.outfit.closet_app.repository.PrendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrendaService {

    private final PrendaRepository prendaRepository;

    public PrendaService(PrendaRepository prendaRepository) {
        this.prendaRepository = prendaRepository;
    }

    public List<Prenda> listarPrendas() {
        return prendaRepository.findAll();
    }

    public Prenda guardarPrenda(Prenda prenda) {
        return prendaRepository.save(prenda);
    }

    public void eliminarPrenda(Long id) {
        prendaRepository.deleteById(id);
    }
}
