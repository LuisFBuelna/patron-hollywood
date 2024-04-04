package com.example.pruebadesacoplehollywood.services.servicesImpl;

import com.example.pruebadesacoplehollywood.entities.Post;
import com.example.pruebadesacoplehollywood.repositories.PostRepository;
import com.example.pruebadesacoplehollywood.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    public final PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }
}
