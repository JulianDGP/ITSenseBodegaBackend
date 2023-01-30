package ITSense.PruebTecnica.Bodega.Security.Service;

import ITSense.PruebTecnica.Bodega.Security.Entity.Rol;
import ITSense.PruebTecnica.Bodega.Security.Enums.RolNombre;
import ITSense.PruebTecnica.Bodega.Security.Repository.RolRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    //Inyeccion de dependencia por constructor:
    private final RolRepository rolRepository;
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }

}
