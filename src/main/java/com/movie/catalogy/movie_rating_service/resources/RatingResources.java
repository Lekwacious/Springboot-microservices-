package com.movie.catalogy.movie_rating_service.resources;

import com.movie.catalogy.movie_rating_service.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResources {
    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 5 );
    }
}
