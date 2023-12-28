package com.CRUDWithPostgresql.repo;

import com.CRUDWithPostgresql.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimeRepository extends JpaRepository<Anime, Long> {
}
