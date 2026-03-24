package com.junior.crud.repository;

import com.junior.crud.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria,Long {
}
