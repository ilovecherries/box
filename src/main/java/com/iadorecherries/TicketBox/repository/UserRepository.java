package com.iadorecherries.TicketBox.repository;

import com.iadorecherries.TicketBox.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
