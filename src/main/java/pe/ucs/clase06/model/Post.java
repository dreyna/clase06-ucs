package pe.ucs.clase06.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author admin
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int idpost;
    private String titulo;
    private String descripcion;    
}
