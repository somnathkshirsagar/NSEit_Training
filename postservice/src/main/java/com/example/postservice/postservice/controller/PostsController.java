package com.example.postservice.postservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.postservice.postservice.model.Posts;
import com.example.postservice.postservice.service.PostsService;

@RestController
public class PostsController {
	
	@Autowired
	PostsService service;
	
	@GetMapping("/posts/all")
	public List<Posts> showAllPosts(){
		return service.displayAllPosts();
	}
	
	@PostMapping("/posts/add")
	public String addPosts(@RequestBody Posts post) {
		service.insertPost(post);
		return "Post Added";
		
	}
	
	@DeleteMapping("/posts/delete/{postId}")
	public String deletePost(@PathVariable("id") int id) {
		service.deletePost(id);
		return "Post Deleted";
	}

}
