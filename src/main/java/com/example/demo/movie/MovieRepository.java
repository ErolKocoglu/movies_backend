package com.example.demo.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findBySeriesTitle(String seriesTitle);

    List<Movie> findByDirector(String director);

    @Query(value = "SELECT m FROM movie m WHERE m.genre LIKE '%:genre%'", nativeQuery = true)
    List<Movie> findByGenre(@Param("genre") String genre);

    @Query(value = "SELECT m FROM movie m WHERE m.star1 = ':star' OR m.star2 = ':star' OR m.star3 =':star' OR m.star4='.star'", nativeQuery = true)
    List<Movie> findByStar(@Param("star") String star);

}
