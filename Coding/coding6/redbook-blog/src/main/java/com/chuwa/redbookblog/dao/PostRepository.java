package com.chuwa.redbookblog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chuwa.redbookblog.entity.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}