package pe.ucs.clase06.dao;


import java.util.List;
import pe.ucs.clase06.model.Post;



/**
 *
 * @author admin
 */
public interface PostDao {
    int create(Post post);
    int update(Post post);
    int delete(int id);
    Post read(int id);
    List<Post> readAll();
}
