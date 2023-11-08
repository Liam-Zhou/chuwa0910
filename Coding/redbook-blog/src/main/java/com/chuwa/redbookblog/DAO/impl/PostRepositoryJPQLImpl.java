package com.chuwa.redbookblog.DAO.impl;

import com.chuwa.redbookblog.DAO.PostRepositoryJPQL;
import com.chuwa.redbookblog.entity.Post;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PostRepositoryJPQLImpl implements PostRepositoryJPQL {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Post> getAllPostWithJPQL() {
        TypedQuery<Post> posts = entityManager.createNamedQuery("Post.getAll",Post.class);
        return posts.getResultList();
    }
}