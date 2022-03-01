package com.examples.postcrud.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.examples.postcrud.model.Posts;
import com.examples.postcrud.service.PostService;
import com.examples.postcrud.service.PostServiceImpl;

public class PostsMain {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		PostService service= new PostServiceImpl();
		
		List<Posts> posts = service.getAllPosts();
		for(Posts p:posts) {
			System.out.println(p.getPid()+" "+p.getTitle()+" "+p.getAuthor()+" "+p.getDescription());
		}
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		System.out.println("Enter title ");
		String title = sc.next();
		System.out.println("Enter author ");
		String author = sc.next();
		System.out.println("Enter description ");
		String description = sc.nextLine();
		String result = service.inserPost(new Posts(pid,author,title,description));
		
		System.out.println(result);
		
		System.out.println("Enter Pid");
		pid=sc.nextInt();
		String result2= service.deletePost(new Posts(pid));
		System.out.println(result2);
		

	}

}
