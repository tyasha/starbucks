package org.yakov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yakov.model.Beverage;

@Repository
public interface BeverageRepository extends JpaRepository<Beverage, Long> {
}
