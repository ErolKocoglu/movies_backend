package com.example.demo.movie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "movie")
public class Movie {
    @Id
    private Integer id;
    private String posterLink;
    private String seriesTitle;
    private Integer releasedYear;
    private String certificate;
    private String runtime;
    private String genre;
    private Double rating;
    private String overview;
    private Integer metaScore;
    private String director;
    private String star1, star2, star3, star4;
    private Integer numberOfVotes;
    private Integer gross;


}
