package com.example.demo.movie;

import jakarta.persistence.Column;
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
    @Column(name="movie_id")
    private Integer id;
    @Column(name="posterlink")
    private String posterLink;
    @Column(name="seriestitle")
    private String seriesTitle;
    @Column(name="releasedyear")
    private Integer releasedYear;
    private String certificate;
    private String runtime;
    private String genre;
    private Double rating;
    private String overview;
    @Column(name = "metascore")
    private Integer metaScore;
    private String director;
    private String star1, star2, star3, star4;
    @Column(name = "numberofvotes")
    private Integer numberOfVotes;
    private String gross;


}
