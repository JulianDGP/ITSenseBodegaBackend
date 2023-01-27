package ITSense.PruebTecnica.Bodega.RestControllers;

import ITSense.PruebTecnica.Bodega.ModelEntities.Producto;
import ITSense.PruebTecnica.Bodega.Services.IProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/producto/api")
public class ProductoRestController {
//    @Autowired
//    private IProductoService iProductoService;

//Inyeccion de dependencia por constructor:
    private final IProductoService iProductoService;
    public ProductoRestController(IProductoService iProductoService) {
        this.iProductoService = iProductoService;
    }


    @GetMapping("/listar")
    public List<Producto> index() {
        return iProductoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Producto show(@PathVariable Long id) {
        return this.iProductoService.findById(id);
    }

    @GetMapping("/stock/{disponibilidadStock}")
    public List <Producto> getBydisponibilidadStock(@PathVariable Boolean disponibilidadStock)
    {
        System.out.println("disponibilidadStock = " + disponibilidadStock);
        return iProductoService.findByDisponibilidadStock(disponibilidadStock);

    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto create(@RequestBody Producto producto) {
        producto.setFechaIngreso(new Date());
        this.iProductoService.save(producto);
        return producto;
    }

    @PutMapping("/editar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
        Producto productoActual = new Producto();
        try {
            productoActual = iProductoService.findById(id);
            productoActual.setNombre(producto.getNombre());
            productoActual.setFechaIngreso(producto.getFechaIngreso());
            productoActual.setFechaRetiro(producto.getFechaRetiro());
            productoActual.setCantidad(producto.getCantidad());
            productoActual.setDefectos(producto.getDefectos());
            productoActual.setElaboracion(producto.getElaboracion());
            productoActual.setDisponibilidadStock(producto.getDisponibilidadStock());
            this.iProductoService.save(productoActual);
            return productoActual;


        } catch (Exception e) {
            e.getMessage();
        }

        return productoActual;
    }

    @DeleteMapping("/borrar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        try {
            Producto productoActual = this.iProductoService.findById(id);
            this.iProductoService.delete(productoActual);

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
