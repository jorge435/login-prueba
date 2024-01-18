package prueba.login.demo.login.service;

import org.springframework.stereotype.Service;
import prueba.login.demo.login.entity.Usuario;

import java.util.List;

@Service
public interface UsuarioService {

    List<Usuario> listAllUser();
    Usuario create_user (Usuario usuario);
    Usuario edit_user (Long id, Usuario usuario);
    void delete_user (Long id);
    Usuario listById(Long id);
    List<Usuario> buscar_nombre (String nombre);

}
