package com.example.movies.Repositories;

import com.example.movies.entities.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IReviewRepository extends MongoRepository<Review, ObjectId> {
}
