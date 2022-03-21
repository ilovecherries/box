package com.iadorecherries.TicketBox.controller;

import com.iadorecherries.TicketBox.model.Post;
import com.iadorecherries.TicketBox.repository.PostRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public Iterable<Post> getPosts() {
        return postRepository.findAll();
    }
}
