package com.outfit.closet_app.repository;


import com.outfit.closet_app.model.Prenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PrendaRepository extends JpaRepository<Prenda, Long> {
}
