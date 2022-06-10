package br.com.josenelson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josenelson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
