package br.com.josenelson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josenelson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
