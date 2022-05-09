/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ucs.clase06.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ucs.clase06.dao.PostDao;
import pe.ucs.clase06.model.Post;
import pe.ucs.clase06.service.PostService;

/**
 *
 * @author admin
 */
@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDao postDao;
    @Override
    public int create(Post post) {
        return postDao.create(post);
    }

    @Override
    public int update(Post post) {
        return postDao.update(post);
    }

    @Override
    public int delete(int id) {
        return postDao.delete(id);
    }

    @Override
    public Post read(int id) {
        return postDao.read(id);
    }

    @Override
    public List<Post> readAll() {
        return postDao.readAll();
    }
    
}
