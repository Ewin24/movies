package com.example.movies.Repositories;

import com.example.movies.entities.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieIRepository extends MongoRepository<Movie, ObjectId> {
}
