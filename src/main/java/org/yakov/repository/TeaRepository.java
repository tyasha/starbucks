package org.yakov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yakov.model.Tea;

@Repository
public interface TeaRepository  extends JpaRepository<Tea, Long> {
}
