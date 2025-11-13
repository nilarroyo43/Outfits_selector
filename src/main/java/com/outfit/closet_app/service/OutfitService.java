package com.outfit.closet_app.service;

import com.outfit.closet_app.model.Outfit;
import com.outfit.closet_app.repository.OutfitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutfitService {

    private OutfitRepository outfitRepository;

    public OutfitService(OutfitRepository outfitRepository) {
        this.outfitRepository = outfitRepository;
    }

    public List<Outfit> listarOutfits() {
        return outfitRepository.findAll();
    }

    public Outfit guardarOutfit(Outfit outfit) {
        return outfitRepository.save(outfit);
    }

    public void eliminarOutfit(Long id) {
        outfitRepository.deleteById(id);
    }
}
