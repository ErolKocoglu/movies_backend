package com.example.demo.movie;


import com.example.demo.dto.MovieResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    public List<MovieResponse> getAllMovies(int page) {
        return movieRepository.find20(page).stream()
                .map(movieMapper::toMovieResponse)
                .collect(Collectors.toList());
    }

    public MovieResponse getMovieById(int id) {
        try {
            var movie = movieRepository.findById(id).orElseThrow();
            return movieMapper.toMovieResponse(movie);
        } catch (NoSuchElementException e) {
            return null;
        }

    }

    public List<MovieResponse> getMovieByGenre(String genre, int offset) {
        return movieRepository.findByGenre(genre, offset).stream()
                .map(movieMapper::toMovieResponse)
                .collect(Collectors.toList());
    }

    public List<MovieResponse> getMovieByDirector(String director, int offset) {
        return movieRepository.findByDirector(director, offset).stream()
                .map(movieMapper::toMovieResponse)
                .collect(Collectors.toList());
    }

    public List<MovieResponse> getMovieByStar(String star, int offset) {
        return movieRepository.findByStar(star, offset).stream()
                .map(movieMapper::toMovieResponse)
                .collect(Collectors.toList());
    }

    public List<MovieResponse> getMovieBySeriesTitle(String seriesTitle, int offset) {
        return movieRepository.findBySeriesTitle(seriesTitle, offset).stream()
                .map(movieMapper::toMovieResponse)
                .collect(Collectors.toList());
    }
}
