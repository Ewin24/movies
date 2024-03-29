package com.example.movies.controllers;

import com.example.movies.Services.MovieService;
import com.example.movies.entities.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies() {
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> singleMovie(@PathVariable ObjectId id) {
//        return new ResponseEntity<Optional<Movie>>(movieService.getMovieById(id), HttpStatus.OK);
//    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> singleMovieImdbId(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieService.getMovieByImdbId(imdbId), HttpStatus.OK);
    }
}
