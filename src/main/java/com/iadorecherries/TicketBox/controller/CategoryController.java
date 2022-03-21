package com.iadorecherries.TicketBox.controller;

import com.iadorecherries.TicketBox.model.Category;
import com.iadorecherries.TicketBox.repository.CategoryRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public Iterable<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
