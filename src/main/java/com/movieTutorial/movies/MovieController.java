package com.movieTutorial.movies;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity<String> getMovies() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }
}
