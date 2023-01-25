package ITSense.PruebTecnica.Bodega.Repository;

import ITSense.PruebTecnica.Bodega.ModelEntities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {
}
