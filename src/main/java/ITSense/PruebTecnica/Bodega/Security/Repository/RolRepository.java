package ITSense.PruebTecnica.Bodega.Security.Repository;

import ITSense.PruebTecnica.Bodega.Security.Entity.Rol;
import ITSense.PruebTecnica.Bodega.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository <Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
