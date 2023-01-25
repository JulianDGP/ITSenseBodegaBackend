package ITSense.PruebTecnica.Bodega.Repository;

import ITSense.PruebTecnica.Bodega.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Integer> {
}
