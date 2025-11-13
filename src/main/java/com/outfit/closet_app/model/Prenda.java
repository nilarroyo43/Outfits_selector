package com.outfit.closet_app.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private String marca;
    private String imageUrl;

    @ElementCollection(targetClass = Station.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "prenda_stations", joinColumns = @JoinColumn(name = "prenda_id"))
    @Column(name = "station")
    private List<Station> stations;

    @ElementCollection
    private List<String> colores;

    @ManyToMany(mappedBy = "prendas")
    private List<Outfit> outfits;

    // --- Getters y Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Station> getStations() { return stations; }
    public void setStation(List<Station> stations) { this.stations = stations; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public List<String> getColores() { return colores; }
    public void setColores(List<String> colores) { this.colores = colores; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public List<Outfit> getOutfits() { return outfits; }
    public void setOutfits(List<Outfit> outfits) { this.outfits = outfits; }
}
