package com.codingdojo.repositories;

import com.codingdojo.model.Tutorial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPlatform(String platform);

    Page<Tutorial> findByPlatform(String source, Pageable pageable);
}
