package com.kdacademy.graphql.graphqlproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kdacademy.graphql.graphqlproject.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
    
}
