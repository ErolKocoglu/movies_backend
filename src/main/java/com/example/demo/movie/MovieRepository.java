package com.example.demo.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    @Query(value = "SELECT m FROM movie WHERE m.seriesTitle LIKE '%:seriesTitle%' OFFSET :_offset LIMIT 20", nativeQuery = true)
    List<Movie> findBySeriesTitle(@Param("seriesTitle") String seriesTitle, @Param("_offset") int _offset);

    @Query(value = "SELECT m FROM movie m WHERE m.director=':director' OFFSET :_offset LIMIT 20", nativeQuery = true)
    List<Movie> findByDirector(@Param("director") String director, @Param("_offset") int _offset);

    @Query(value = "SELECT m FROM movie m WHERE m.genre LIKE '%:genre%' OFFSET :_offset LIMIT 20", nativeQuery = true)
    List<Movie> findByGenre(@Param("genre") String genre, @Param("_offset") int _offset);

    @Query(value = "SELECT m FROM movie m WHERE m.star1 = ':star' OR m.star2 = ':star' OR m.star3 =':star' OR m.star4='.star' OFFSET :_offset LIMIT 20", nativeQuery = true)
    List<Movie> findByStar(@Param("star") String star, @Param("_offset") int _offset);

    @Query(value = "SELECT * FROM movie OFFSET :_offset LIMIT 20", nativeQuery = true)
    List<Movie> find20(@Param("_offset") int _offset);

}
