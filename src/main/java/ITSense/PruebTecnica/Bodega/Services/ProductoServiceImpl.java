package ITSense.PruebTecnica.Bodega.Services;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import ITSense.PruebTecnica.Bodega.Repository.IProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProdcutoService {

    @Autowired private IProductosRepository productosRepository;

    //Inyeccion de dependencia por constructor
//    private final IProductosRepository productosRepository;
//    public ProductoServiceImpl(IProductosRepository productosRepository) {
//        this.productosRepository = productosRepository;
//    }
    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productosRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return null;
    }
}
