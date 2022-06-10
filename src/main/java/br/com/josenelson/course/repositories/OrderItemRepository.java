package br.com.josenelson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josenelson.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
