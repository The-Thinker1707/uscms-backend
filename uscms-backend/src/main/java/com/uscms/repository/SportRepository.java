package com.uscms.repository;

import com.uscms.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SportRepository extends JpaRepository<Sport, Long> {
    Optional<Sport> findBySlug(String slug);
}