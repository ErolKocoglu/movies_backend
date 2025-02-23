package com.example.demo.dto;

public record MovieResponse(Integer id,
                            String posterLink,
                            String seriesTitle,
                            Integer releasedYear,
                            String certificate,
                            String runtime,
                            String genre,
                            Double rating,
                            String overview,
                            Integer metaScore,
                            String director,
                            String star1, String star2, String star3, String star4,
                            Integer numberOfVotes,
                            Integer gross) {

}
