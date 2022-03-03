package com.example.postservice.postservice.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.postservice.postservice.model.Posts;


@Repository
@Transactional
public interface PostsRepo extends CrudRepository<Posts,Integer>{

}
