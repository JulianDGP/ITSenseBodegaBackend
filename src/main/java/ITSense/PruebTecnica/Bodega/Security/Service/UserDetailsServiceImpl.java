package ITSense.PruebTecnica.Bodega.Security.Service;

import ITSense.PruebTecnica.Bodega.Security.Entity.Usuario;
import ITSense.PruebTecnica.Bodega.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;


    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
}
