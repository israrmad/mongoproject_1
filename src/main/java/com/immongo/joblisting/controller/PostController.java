package com.immongo.joblisting.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immongo.joblisting.model.Post;
import com.immongo.joblisting.repo.PostRepository;

import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {
	
	@Autowired
	PostRepository postRepo;
	
	@ApiIgnore
	@RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
	
	@GetMapping(value="/posts")
	public List<Post> getAllPost(){
		return postRepo.findAll();
	}
	
	@PostMapping(value="/post")
	public Post addPost(@RequestBody Post post) {
		return postRepo.save(post);
	}
	
	
	
}
