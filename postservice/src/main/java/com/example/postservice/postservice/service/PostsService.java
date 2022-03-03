package com.example.postservice.postservice.service;

import java.util.List;

import com.example.postservice.postservice.model.Posts;

public interface PostsService {
	
	 public String insertPost(Posts post);

	 public List<Posts> displayAllPosts();

	 public String deletePost(int postId);

	 public List<Posts> searchPostsByAuthor(String author);

	 public List<Posts> searchPostsByTitle(String title);



}
