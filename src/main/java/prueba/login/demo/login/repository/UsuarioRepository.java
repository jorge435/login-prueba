package prueba.login.demo.login.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import prueba.login.demo.login.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
