package com.example.pruebadesacoplehollywood.repositories;

import com.example.pruebadesacoplehollywood.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
