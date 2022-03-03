package com.example.postservice.postservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postservice.postservice.model.Posts;
import com.example.postservice.postservice.repo.PostsRepo;

@Service
public class PostsServiceImpl implements PostsService {
	
	@Autowired
	PostsRepo repo;

	@Override
	public String insertPost(Posts post) {
		repo.save(post);
		return "Post Inserted" ;
	}

	@Override
	public List<Posts> displayAllPosts() {
		
		return (List<Posts>) repo.findAll();
	}

	@Override
	public String deletePost(int id) {
		repo.deleteById(id);
		return "Post Deleted";
	}

	@Override
	public List<Posts> searchPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Posts> searchPostsByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
