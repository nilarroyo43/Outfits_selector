package com.outfit.closet_app.controller;

import com.outfit.closet_app.model.Outfit;
import com.outfit.closet_app.service.OutfitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/outfits")
@CrossOrigin(origins = "*")
public class OutfitController {

    private final OutfitService outfitService;

    public OutfitController(OutfitService outfitService) {
        this.outfitService = outfitService;
    }

    @GetMapping
    public List<Outfit> listarOutfits() {
        return outfitService.listarOutfits();
    }

    @PostMapping
    public Outfit crearOutfit(@RequestBody Outfit outfit) {
        return outfitService.guardarOutfit(outfit);
    }

    @DeleteMapping("/{id}")
    public void eliminarOutfit(@PathVariable Long id) {
        outfitService.eliminarOutfit(id);
    }
}
