package com.iadorecherries.TicketBox.repository;

import com.iadorecherries.TicketBox.model.Post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
    
}
