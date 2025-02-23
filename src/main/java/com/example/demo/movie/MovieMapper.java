package com.example.demo.movie;

import com.example.demo.dto.MovieRequest;
import com.example.demo.dto.MovieResponse;
import org.springframework.stereotype.Service;

@Service
public class MovieMapper {
    public MovieResponse toMovieResponse(Movie movie) {
        return new MovieResponse(movie.getId(), movie.getPosterLink(), movie.getSeriesTitle(),
                movie.getReleasedYear(), movie.getCertificate(), movie.getRuntime(),
                movie.getGenre(), movie.getRating(), movie.getOverview(),
                movie.getMetaScore(), movie.getDirector(), movie.getStar1(),
                movie.getStar2(), movie.getStar3(), movie.getStar4(), movie.getNumberOfVotes(),
                movie.getGross());
    }

    public Movie toMovie(MovieRequest movieRequest) {
        return Movie.builder().id(null)
                .gross(movieRequest.gross())
                .genre(movieRequest.genre())
                .certificate(movieRequest.certificate())
                .star1(movieRequest.star1())
                .star2(movieRequest.star2())
                .star3(movieRequest.star3())
                .star4(movieRequest.star4())
                .metaScore(movieRequest.metaScore())
                .numberOfVotes(movieRequest.numberOfVotes())
                .rating(movieRequest.rating())
                .runtime(movieRequest.runtime())
                .overview(movieRequest.overview())
                .posterLink(movieRequest.posterLink())
                .releasedYear(movieRequest.releasedYear())
                .director(movieRequest.director())
                .seriesTitle(movieRequest.seriesTitle())
                .build();
    }
}
