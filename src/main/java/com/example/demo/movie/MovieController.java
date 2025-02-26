package com.example.demo.movie;

import com.example.demo.dto.MovieResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    //Optional path variables
    @GetMapping(value = {"/", "/{pageNumber}"})
    public ResponseEntity<List<MovieResponse>> getMovies(@PathVariable(required = false) Integer pageNumber) {
        if (pageNumber == null) {
            pageNumber = 0;
        }
        return ResponseEntity.status(HttpStatus.OK).body(movieService.getAllMovies(pageNumber));
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<MovieResponse> getMovie(@PathVariable Integer id) {
        MovieResponse movie = movieService.getMovieById(id);
        if (movie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }

    @GetMapping(value = {"/genres/{genre}", "/genres/{genre}/{pageNumber}"})
    public ResponseEntity<List<MovieResponse>> getMoviesByGenre(
            @PathVariable String genre,
            @PathVariable(required = false) Integer pageNumber) {
        System.out.println(genre);
        if (pageNumber == null) {
            pageNumber = 0;
        }
        return ResponseEntity.status(HttpStatus.OK).body(movieService.getMovieByGenre(genre, pageNumber));
    }

    @GetMapping(value = {"/directors/{director}", "/directors/{director}/{pageNumber}"})
    public ResponseEntity<List<MovieResponse>> getMoviesByDirector(
            @PathVariable String director,
            @PathVariable(required = false) Integer pageNumber) {
        System.out.println(director);
        if (pageNumber == null) {
            pageNumber = 0;
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(movieService.getMovieByDirector(director, pageNumber));

    }

    @GetMapping(value = {"/stars/{star}", "/stars/{star}/{pageNumber}"})
    public ResponseEntity<List<MovieResponse>> getMoviesByStar(
            @PathVariable String star,
            @PathVariable(required = false) Integer pageNumber) {
        if (pageNumber == null) {
            pageNumber = 0;
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(movieService.getMovieByStar(star, pageNumber));
    }

    @GetMapping(value = {"/search", "/search/{pageNumber}"})
    public ResponseEntity<List<MovieResponse>> getMoviesBySearch(
            @RequestParam("title") String title,
            @PathVariable(required = false) Integer pageNumber) {
        if(pageNumber == null) {
            pageNumber = 0;
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(movieService.getMovieBySeriesTitle(title, pageNumber));
    }
}
