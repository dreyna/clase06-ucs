package pe.ucs.clase06.daoImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.ucs.clase06.dao.PostDao;
import pe.ucs.clase06.model.Post;


/**
 *
 * @author admin
 */
@Repository
public class PostDaoImpl implements PostDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Post post) {
        String SQL ="INSERT INTO post(titulo, descripcion) VALUES(?,?)";
        return jdbcTemplate.update(SQL,new Object[]{post.getTitulo(),post.getDescripcion()});
    }

    @Override
    public int update(Post post) {
        String SQL ="UPDATE post SET titulo=?, descripcion=? WHERE idpost=?";                 
        return jdbcTemplate.update(SQL,new Object[]{post.getTitulo(), post.getDescripcion(), post.getIdpost()});
    }

    @Override
    public int delete(int id) {
        String SQL ="DELETE FROM post WHERE idpost=?"; 
        return jdbcTemplate.update(SQL,id);
        
    }

    @Override
    public Post read(int id) {
        String SQL ="SELECT *FROM post WHERE idpost=?";
        try {
            Post post = jdbcTemplate.queryForObject(SQL, BeanPropertyRowMapper.newInstance(Post.class),id);
            return post;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Post> readAll() {
        String SQL ="SELECT idpost, titulo, descripcion FROM post ORDER BY idpost ASC";        
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Post.class));
    }
    
}
