package com.iadorecherries.TicketBox.repository;

import com.iadorecherries.TicketBox.model.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
    
}
