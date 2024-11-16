package org.yakov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yakov.model.Bucket;

@Repository
public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
