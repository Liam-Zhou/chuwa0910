package kechen.hw10springbootredbook.dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import kechen.hw10springbootredbook.dao.PostJPQLRepository;
import kechen.hw10springbootredbook.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PostJPQLRepositoryImpl implements PostJPQLRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Post> getAllPostWithJPQL() {
        TypedQuery<Post> posts = entityManager.createNamedQuery("Post.getAll", Post.class);
        return posts.getResultList();
    }

    /**
     * entityManager:
     *  1. Insert Update: entityManager.merge()
     *  2. Select: entityManager.find();
     *  3. delete: entityManager.remove();
     *
     *  代码的测试在test package下
     */

    public Post insertPost(Post post) {
        // post中可以無ID
        return entityManager.merge(post);
    }

    public Post updatePost(Post post) {
        // post中必须有id才行。
        return entityManager.merge(post);
    }

    public Post getPostById(Long id) {
        return entityManager.find(Post.class, id);
    }

    public void deleteById(Long id) {
        Post post = entityManager.find(Post.class, id);
        entityManager.remove(post);
    }

    /**
     * 练习下generic
     * @param t
     * @return
     * @param <T>
     */
    public <T> T insertData(T t) {
        return entityManager.merge(t);
    }
}
