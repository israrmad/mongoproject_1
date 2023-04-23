package com.immongo.joblisting.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.immongo.joblisting.model.Post;

@Service
public interface PostRepository extends MongoRepository<Post, String> {

}
