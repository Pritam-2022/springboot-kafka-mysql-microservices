package net.springboot.demo.repository;

import net.springboot.demo.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {

}
