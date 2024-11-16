package org.yakov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yakov.model.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}
