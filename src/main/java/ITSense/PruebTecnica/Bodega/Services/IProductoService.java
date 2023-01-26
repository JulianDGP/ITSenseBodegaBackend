package ITSense.PruebTecnica.Bodega.Services;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();

    public void save(Producto producto);

    public Producto findById(Long id);

    void delete(Producto productoActual);

    List<Producto> findByDisponibilidadStock(Boolean disponibilidadStock);
}
