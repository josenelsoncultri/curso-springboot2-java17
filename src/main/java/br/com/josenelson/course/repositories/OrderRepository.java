package br.com.josenelson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josenelson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
