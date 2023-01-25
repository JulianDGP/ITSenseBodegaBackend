package ITSense.PruebTecnica.Bodega.RestControllers;

import ITSense.PruebTecnica.Bodega.ModelEntities.Productos;
import ITSense.PruebTecnica.Bodega.Services.ProductosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/productos/api")
public class ProductosRestController {

    //Inyeccion de dependencia por propiedad @Autowired private ProductosService productosService;

    //Inyeccion por constructor
    private final ProductosService productosService;

    public ProductosRestController(ProductosService productosService) {
        this.productosService = productosService;
    }

    @GetMapping("/listar")
    private ResponseEntity<List<Productos>> getAllProductos(){

        return ResponseEntity.ok(productosService.findAll());
    }

    @PostMapping("/guardar")
    private ResponseEntity<Productos> postProdcutos(@RequestBody Productos productos){
        Productos productoguardado = productosService.save(productos);
        try {
            return ResponseEntity.created(new URI("/productos" + productoguardado.getId())).body(productoguardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
