package ITSense.PruebTecnica.Bodega.Services;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProdcutoService {

    public List<Producto> findAll();
}
