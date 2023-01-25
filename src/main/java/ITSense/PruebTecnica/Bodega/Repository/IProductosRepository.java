package ITSense.PruebTecnica.Bodega.Repository;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IProductosRepository extends CrudRepository <Producto, Long> {
}
