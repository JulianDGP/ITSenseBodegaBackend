package ITSense.PruebTecnica.Bodega.Repository;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductosRepository extends JpaRepository <Producto, Long> {

    List <Producto> findByDisponibilidadStock(Boolean disponibilidadStock);
}
